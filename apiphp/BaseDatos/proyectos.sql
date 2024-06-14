-- Crear base de datos
CREATE DATABASE IF NOT EXISTS gestionproyectos;
USE gestionproyectos;

-- Crear tabla `proyectos`
CREATE TABLE `proyectos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Insertar datos iniciales en `proyectos`
INSERT INTO `proyectos` (`nombre`, `descripcion`, `fecha_inicio`, `fecha_fin`) VALUES
('Proyecto Alpha', 'Descripción del Proyecto Alpha', '2024-06-01', '2024-12-01'),
('Proyecto Beta', 'Descripción del Proyecto Beta', '2024-07-01', '2024-11-01');

-- Crear tabla `tareas`
CREATE TABLE `tareas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `proyecto_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `proyecto_id` (`proyecto_id`),
  CONSTRAINT `tareas_ibfk_1` FOREIGN KEY (`proyecto_id`) REFERENCES `proyectos` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Insertar datos iniciales en `tareas`
INSERT INTO `tareas` (`nombre`, `descripcion`, `estado`, `fecha_inicio`, `fecha_fin`, `proyecto_id`) VALUES
('Tarea 1 de Alpha', 'Descripción de la Tarea 1 del Proyecto Alpha', 'En progreso', '2024-06-05', '2024-06-20', 1),
('Tarea 2 de Alpha', 'Descripción de la Tarea 2 del Proyecto Alpha', 'Pendiente', '2024-06-21', '2024-07-05', 1),
('Tarea 1 de Beta', 'Descripción de la Tarea 1 del Proyecto Beta', 'Completada', '2024-07-05', '2024-07-20', 2),
('Tarea 2 de Beta', 'Descripción de la Tarea 2 del Proyecto Beta', 'En progreso', '2024-07-21', '2024-08-05', 2);

-- Crear tabla `historial_proyectos`
CREATE TABLE `historial_proyectos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `fecha_eliminacion` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Crear tabla `historial_tareas`
CREATE TABLE `historial_tareas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `proyecto_id` int(11) DEFAULT NULL,
  `fecha_eliminacion` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Crear trigger para eliminar proyectos y guardar en el historial
DELIMITER //

CREATE TRIGGER before_delete_proyecto
BEFORE DELETE ON proyectos
FOR EACH ROW
BEGIN
  -- Insertar el proyecto en el historial
  INSERT INTO historial_proyectos (id, nombre, descripcion, fecha_inicio, fecha_fin, fecha_eliminacion)
  VALUES (OLD.id, OLD.nombre, OLD.descripcion, OLD.fecha_inicio, OLD.fecha_fin, NOW());

  -- Insertar las tareas relacionadas en el historial
  INSERT INTO historial_tareas (id, nombre, descripcion, estado, fecha_inicio, fecha_fin, proyecto_id, fecha_eliminacion)
  SELECT id, nombre, descripcion, estado, fecha_inicio, fecha_fin, proyecto_id, NOW()
  FROM tareas
  WHERE proyecto_id = OLD.id;

  -- Eliminar las tareas relacionadas
  DELETE FROM tareas WHERE proyecto_id = OLD.id;
END//

DELIMITER ;

-- Crear trigger para eliminar tareas y guardar en el historial
DELIMITER //

CREATE TRIGGER before_delete_tarea
BEFORE DELETE ON tareas
FOR EACH ROW
BEGIN
  -- Insertar la tarea en el historial
  INSERT INTO historial_tareas (id, nombre, descripcion, estado, fecha_inicio, fecha_fin, proyecto_id, fecha_eliminacion)
  VALUES (OLD.id, OLD.nombre, OLD.descripcion, OLD.estado, OLD.fecha_inicio, OLD.fecha_fin, OLD.proyecto_id, NOW());
END//

DELIMITER ;
