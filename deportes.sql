-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-09-2019 a las 23:32:09
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.5.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `deportes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datospersonales`
--

CREATE TABLE `datospersonales` (
  `dp_codigo` int(11) NOT NULL,
  `dp_nombre` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `dp_carrera` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `dp_semestre` int(11) NOT NULL,
  `dp_disciplina` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `dp_nss` int(11) NOT NULL,
  `dp_tel` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `dp_dir` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `dp_alergias` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `dp_foto` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datospersonales`
--
ALTER TABLE `datospersonales`
  ADD PRIMARY KEY (`dp_codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
