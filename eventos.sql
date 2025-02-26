-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-02-2025 a las 17:02:44
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `eventostecnologicos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eventos`
--

CREATE TABLE `eventos` (
  `eve_id` int(11) NOT NULL,
  `fue_id` int(11) DEFAULT NULL,
  `eve_titulo` varchar(255) DEFAULT NULL,
  `eve_descripcion` text DEFAULT NULL,
  `eve_fecha_inicio` datetime DEFAULT NULL,
  `eve_fecha_fin` datetime DEFAULT NULL,
  `eve_ubicacion` varchar(255) DEFAULT NULL,
  `eve_enlace` varchar(512) DEFAULT NULL,
  `eve_fecha_creacion` timestamp NOT NULL DEFAULT current_timestamp(),
  `eve_fecha_modificacion` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `eve_estado` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `eventos`
--

INSERT INTO `eventos` (`eve_id`, `fue_id`, `eve_titulo`, `eve_descripcion`, `eve_fecha_inicio`, `eve_fecha_fin`, `eve_ubicacion`, `eve_enlace`, `eve_fecha_creacion`, `eve_fecha_modificacion`, `eve_estado`) VALUES
(1, 1, 'TechCrunch Disrupt', 'Una conferencia sobre las últimas innovaciones en tecnología', '2025-03-15 09:00:00', '2025-03-17 18:00:00', 'San Francisco, CA', 'https://techcrunch.com/disrupt', '2025-02-26 15:59:01', '2025-02-26 15:59:01', 'Activo'),
(2, 2, 'Evento de Innovación', 'Conferencia sobre las nuevas tendencias en innovación', '2025-04-10 10:00:00', '2025-04-12 16:00:00', 'Madrid, España', 'https://www.eventbrite.com/e/evento-de-innovacion', '2025-02-26 15:59:01', '2025-02-26 15:59:01', 'Activo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `eventos`
--
ALTER TABLE `eventos`
  ADD PRIMARY KEY (`eve_id`),
  ADD KEY `fue_id` (`fue_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `eventos`
--
ALTER TABLE `eventos`
  MODIFY `eve_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `eventos`
--
ALTER TABLE `eventos`
  ADD CONSTRAINT `eventos_ibfk_1` FOREIGN KEY (`fue_id`) REFERENCES `fuentes` (`fue_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
