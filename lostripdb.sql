-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-08-2021 a las 00:57:11
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `lostripdb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alojamientos`
--

CREATE TABLE `alojamientos` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `dueno` varchar(255) DEFAULT NULL,
  `estrellas` int(11) NOT NULL,
  `localizacion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `oferta` bit(1) NOT NULL,
  `valoracion` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alojamientos`
--

INSERT INTO `alojamientos` (`id`, `descripcion`, `dueno`, `estrellas`, `localizacion`, `nombre`, `oferta`, `valoracion`) VALUES
(1, 'Acogedora casa en la sierra de León, con vistas a la montaña.', 'mD0AEQBvKkefdja0zqF6050pt4v1', 4, 'León', 'Casa en la montaña', b'1', 6.666666666666667),
(15, 'Piso en primera linea de playa en el pueblo de Baiona', 'BWsJ47yyPJVBAQxNXn1Wv5z2Git1', 4, 'baiona', 'Piso en la playa', b'1', 8.7),
(98, 'Hotel en el centro de Ourense, con una parada de autobús al lado.', 'mD0AEQBvKkefdja0zqF6050pt4v1', 4, 'Ourense', 'Hotel Barceló', b'0', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alojamientos_comentarios`
--

CREATE TABLE `alojamientos_comentarios` (
  `alojamientos_id` bigint(20) NOT NULL,
  `comentarios_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alojamientos_comentarios`
--

INSERT INTO `alojamientos_comentarios` (`alojamientos_id`, `comentarios_id`) VALUES
(1, 3),
(1, 144),
(1, 145),
(1, 149),
(1, 151),
(1, 152),
(15, 16);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alojamientos_filtros`
--

CREATE TABLE `alojamientos_filtros` (
  `alojamientos_id` bigint(20) NOT NULL,
  `filtros_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alojamientos_filtros`
--

INSERT INTO `alojamientos_filtros` (`alojamientos_id`, `filtros_id`) VALUES
(1, 2),
(1, 130),
(1, 131),
(1, 132),
(15, 17),
(98, 125),
(98, 126),
(98, 127);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alojamientos_fotos`
--

CREATE TABLE `alojamientos_fotos` (
  `alojamientos_id` bigint(20) NOT NULL,
  `fotos_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alojamientos_fotos`
--

INSERT INTO `alojamientos_fotos` (`alojamientos_id`, `fotos_id`) VALUES
(1, 4),
(1, 5),
(15, 18),
(98, 102);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alojamientos_habitaciones`
--

CREATE TABLE `alojamientos_habitaciones` (
  `alojamientos_id` bigint(20) NOT NULL,
  `habitaciones_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alojamientos_habitaciones`
--

INSERT INTO `alojamientos_habitaciones` (`alojamientos_id`, `habitaciones_id`) VALUES
(1, 6),
(15, 19),
(98, 103),
(98, 110);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caracteristicas`
--

CREATE TABLE `caracteristicas` (
  `id` bigint(20) NOT NULL,
  `caracteristica` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `caracteristicas`
--

INSERT INTO `caracteristicas` (`id`, `caracteristica`) VALUES
(8, 'Bañera'),
(9, 'Terraza'),
(10, 'Aseo privado'),
(11, 'Cafetera'),
(20, 'Ducha'),
(21, 'Terraza'),
(22, 'Aseo privado'),
(23, 'Cocina'),
(24, 'Grande'),
(104, 'Hidromasaje'),
(105, 'Aseo privado'),
(106, 'Terraza'),
(107, 'Toallas'),
(108, 'Cafetera'),
(111, 'Aseo privado'),
(112, 'Wifi'),
(113, 'Toallas'),
(114, 'Aseo privado'),
(115, 'Cafetera');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentarios`
--

CREATE TABLE `comentarios` (
  `id` bigint(20) NOT NULL,
  `comentario` longtext DEFAULT NULL,
  `userid` varchar(255) DEFAULT NULL,
  `valoracion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `comentarios`
--

INSERT INTO `comentarios` (`id`, `comentario`, `userid`, `valoracion`) VALUES
(3, 'Maravilloso con buenas vistas', 'mD0AEQBvKkefdja0zqF6050pt4v1', 0),
(16, 'Buen sitio de vacaciones', 'BWsJ47yyPJVBAQxNXn1Wv5z2Git1', 0),
(144, 'Buen alojamiento con agradables vistas a la montaña.', 'mD0AEQBvKkefdja0zqF6050pt4v1', 6),
(145, 'Buenisima piscina con aguas termales.', 'mD0AEQBvKkefdja0zqF6050pt4v1', 8),
(149, 'iuboiugboiubwrtgoiuwbeoigub', 'mD0AEQBvKkefdja0zqF6050pt4v1', 6),
(151, 'VAYA PASADA DE ALOJAMIENTO!!!', '1rY5oQo7V9cFna51Tk1BIzoWy9G3', 10),
(152, 'ME FLIPA ES UNA PASADA OIEUFBOIWEF', '1rY5oQo7V9cFna51Tk1BIzoWy9G3', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentarios_ex`
--

CREATE TABLE `comentarios_ex` (
  `id` bigint(20) NOT NULL,
  `comentario` longtext DEFAULT NULL,
  `userid` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencias`
--

CREATE TABLE `experiencias` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `estrellas` int(11) NOT NULL,
  `localizacion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `oferta` bit(1) NOT NULL,
  `precio` int(11) NOT NULL,
  `valoracion` double NOT NULL,
  `dueno` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `experiencias`
--

INSERT INTO `experiencias` (`id`, `descripcion`, `estrellas`, `localizacion`, `nombre`, `oferta`, `precio`, `valoracion`, `dueno`) VALUES
(119, 'Duerme bajo las estrellas en este increíble hotel, con telescopio incluido.', 4, 'Pontevedra', 'Hotel Burbuja', b'0', 135, 0, 'mD0AEQBvKkefdja0zqF6050pt4v1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencias_comentarios_exp`
--

CREATE TABLE `experiencias_comentarios_exp` (
  `experiencias_id` bigint(20) NOT NULL,
  `comentarios_exp_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencias_filtros_exp`
--

CREATE TABLE `experiencias_filtros_exp` (
  `experiencias_id` bigint(20) NOT NULL,
  `filtros_exp_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `experiencias_filtros_exp`
--

INSERT INTO `experiencias_filtros_exp` (`experiencias_id`, `filtros_exp_id`) VALUES
(119, 120),
(119, 121);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencias_fotos_exp`
--

CREATE TABLE `experiencias_fotos_exp` (
  `experiencias_id` bigint(20) NOT NULL,
  `fotos_exp_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `experiencias_fotos_exp`
--

INSERT INTO `experiencias_fotos_exp` (`experiencias_id`, `fotos_exp_id`) VALUES
(119, 122);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `filtros`
--

CREATE TABLE `filtros` (
  `id` bigint(20) NOT NULL,
  `filtros` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `filtros`
--

INSERT INTO `filtros` (`id`, `filtros`) VALUES
(2, 'Piscina'),
(17, 'Playa'),
(125, 'Centro'),
(126, 'Piscina'),
(127, 'Ciudad'),
(130, 'Montaña'),
(131, 'Wifi'),
(132, 'Admite mascotas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `filtros_exp`
--

CREATE TABLE `filtros_exp` (
  `id` bigint(20) NOT NULL,
  `filtros` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `filtros_exp`
--

INSERT INTO `filtros_exp` (`id`, `filtros`) VALUES
(120, 'naturaleza'),
(121, 'jardin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fotos`
--

CREATE TABLE `fotos` (
  `id` bigint(20) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `imagen_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `fotos`
--

INSERT INTO `fotos` (`id`, `url`, `imagen_id`) VALUES
(4, '/assets/Imagenes/alojamientos/montanaLeon.jpg', NULL),
(5, '/assets/Imagenes/alojamientos/montanaLeon.jpg', NULL),
(18, '/assets/Imagenes/alojamientos/playaBaiona.jpg', NULL),
(102, 'http://res.cloudinary.com/dwzni0pp9/image/upload/v1627483803/ubkzepoyfwzn1d519kqy.jpg', 'ubkzepoyfwzn1d519kqy');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fotos_exp`
--

CREATE TABLE `fotos_exp` (
  `id` bigint(20) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `imagen_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `fotos_exp`
--

INSERT INTO `fotos_exp` (`id`, `url`, `imagen_id`) VALUES
(122, 'https://res.cloudinary.com/dwzni0pp9/image/upload/v1627547231/u5l9mcxrkxd4vrpia6pl.jpg', 'u5l9mcxrkxd4vrpia6pl');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fotos_hab`
--

CREATE TABLE `fotos_hab` (
  `id` bigint(20) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `imagen_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `fotos_hab`
--

INSERT INTO `fotos_hab` (`id`, `url`, `imagen_id`) VALUES
(7, '/assets/Imagenes/alojamientos/habitacion/habitacionCasaMontana.jpg', NULL),
(25, '/assets/Imagenes/alojamientos/habitacion/habitacionTerrazaPlaya.jpg', NULL),
(109, 'http://res.cloudinary.com/dwzni0pp9/image/upload/v1627483875/ze1hhq8yifczapcesuab.jpg', 'ze1hhq8yifczapcesuab'),
(116, 'http://res.cloudinary.com/dwzni0pp9/image/upload/v1627483903/rkbcqjyvslf9fwsidstr.jpg', 'rkbcqjyvslf9fwsidstr');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `id` bigint(20) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `nombre_hab` varchar(255) DEFAULT NULL,
  `precio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitaciones`
--

INSERT INTO `habitaciones` (`id`, `capacidad`, `nombre_hab`, `precio`) VALUES
(6, 2, 'Superior con vistas a la montaña', 80),
(19, 4, 'Terraza y vistas a la playa', 110),
(103, 2, 'Superior con bañera', 120),
(110, 2, 'Superior normal', 80);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones_caracteristicas`
--

CREATE TABLE `habitaciones_caracteristicas` (
  `habitaciones_id` bigint(20) NOT NULL,
  `caracteristicas_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitaciones_caracteristicas`
--

INSERT INTO `habitaciones_caracteristicas` (`habitaciones_id`, `caracteristicas_id`) VALUES
(6, 8),
(6, 9),
(6, 10),
(6, 11),
(19, 20),
(19, 21),
(19, 22),
(19, 23),
(19, 24),
(103, 104),
(103, 105),
(103, 106),
(103, 107),
(103, 108),
(110, 111),
(110, 112),
(110, 113),
(110, 114),
(110, 115);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones_fotos_hab`
--

CREATE TABLE `habitaciones_fotos_hab` (
  `habitaciones_id` bigint(20) NOT NULL,
  `fotos_hab_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitaciones_fotos_hab`
--

INSERT INTO `habitaciones_fotos_hab` (`habitaciones_id`, `fotos_hab_id`) VALUES
(6, 7),
(19, 25),
(103, 109),
(110, 116);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(153);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `id` bigint(20) NOT NULL,
  `alojamiento_id` varchar(255) DEFAULT NULL,
  `fecha_entrada` datetime DEFAULT NULL,
  `fecha_salida` datetime DEFAULT NULL,
  `personas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reservas`
--

INSERT INTO `reservas` (`id`, `alojamiento_id`, `fecha_entrada`, `fecha_salida`, `personas`) VALUES
(140, '1', '2021-07-11 02:00:00', '2021-07-18 02:00:00', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `userid` varchar(255) NOT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` datetime DEFAULT NULL,
  `foto_perfil` varchar(255) DEFAULT NULL,
  `nick` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` int(11) NOT NULL,
  `usuario_rol` int(11) DEFAULT NULL,
  `genero` int(11) DEFAULT NULL,
  `nacionalidad` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`userid`, `apellidos`, `email`, `fecha_nacimiento`, `foto_perfil`, `nick`, `nombre`, `telefono`, `usuario_rol`, `genero`, `nacionalidad`) VALUES
('1rY5oQo7V9cFna51Tk1BIzoWy9G3', NULL, 'aaronmartinezviso@gmail.com', '2001-08-10 02:00:00', '/assets/Imagenes/usuarios/user.jpg', 'Aaronmv', 'Rodolfo', 722257405, 2, 2, 'España'),
('BWsJ47yyPJVBAQxNXn1Wv5z2Git1', NULL, 'aliaszaida@gmail.com', NULL, '/assets/Imagenes/usuarios/user.jpg', NULL, 'Zaida', 0, 1, NULL, NULL),
('mD0AEQBvKkefdja0zqF6050pt4v1', 'Martinez', 'aaronmv2000@gmail.com', '2000-06-02 02:00:00', '/assets/Imagenes/usuarios/mD0AEQBvKkefdja0zqF6050pt4v1avatar.jpg', 'Aaronmv', 'Aaron', 722257405, 0, 0, 'España');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_reservas`
--

CREATE TABLE `usuario_reservas` (
  `usuario_userid` varchar(255) NOT NULL,
  `reservas_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario_reservas`
--

INSERT INTO `usuario_reservas` (`usuario_userid`, `reservas_id`) VALUES
('mD0AEQBvKkefdja0zqF6050pt4v1', 140);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alojamientos`
--
ALTER TABLE `alojamientos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `alojamientos_comentarios`
--
ALTER TABLE `alojamientos_comentarios`
  ADD UNIQUE KEY `UK_q029ndtak4urpdso27kycs3cm` (`comentarios_id`),
  ADD KEY `FKot3ecofvg9s4kxyqqd3s5kgum` (`alojamientos_id`);

--
-- Indices de la tabla `alojamientos_filtros`
--
ALTER TABLE `alojamientos_filtros`
  ADD UNIQUE KEY `UK_7he6v90b0cfl883gplfmwrpnn` (`filtros_id`),
  ADD KEY `FK4hkxdsftqt8s0pb0kjen96can` (`alojamientos_id`);

--
-- Indices de la tabla `alojamientos_fotos`
--
ALTER TABLE `alojamientos_fotos`
  ADD UNIQUE KEY `UK_j6s4s9h60okydo258t2md3i02` (`fotos_id`),
  ADD KEY `FKcp3gek1q28nyts6u5j0j40km4` (`alojamientos_id`);

--
-- Indices de la tabla `alojamientos_habitaciones`
--
ALTER TABLE `alojamientos_habitaciones`
  ADD UNIQUE KEY `UK_bfvf3rakxu8q7aoeh4xesdugq` (`habitaciones_id`),
  ADD KEY `FK3gg8y6eckka6wswtnqehefr4a` (`alojamientos_id`);

--
-- Indices de la tabla `caracteristicas`
--
ALTER TABLE `caracteristicas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `comentarios_ex`
--
ALTER TABLE `comentarios_ex`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `experiencias`
--
ALTER TABLE `experiencias`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `experiencias_comentarios_exp`
--
ALTER TABLE `experiencias_comentarios_exp`
  ADD UNIQUE KEY `UK_8xrk7xhubbrefwvlhcr6t28oq` (`comentarios_exp_id`),
  ADD KEY `FKp50p470m990gpvp3b7tranh62` (`experiencias_id`);

--
-- Indices de la tabla `experiencias_filtros_exp`
--
ALTER TABLE `experiencias_filtros_exp`
  ADD UNIQUE KEY `UK_63fsv66ra76fafiwwaxffyewh` (`filtros_exp_id`),
  ADD KEY `FKtn5ef858fyt0jsrfksjuykcj4` (`experiencias_id`);

--
-- Indices de la tabla `experiencias_fotos_exp`
--
ALTER TABLE `experiencias_fotos_exp`
  ADD UNIQUE KEY `UK_1ldlgt527jwi6r2bxkccb5trs` (`fotos_exp_id`),
  ADD KEY `FKfcfrujv6l477fl8lli3mdex2x` (`experiencias_id`);

--
-- Indices de la tabla `filtros`
--
ALTER TABLE `filtros`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `filtros_exp`
--
ALTER TABLE `filtros_exp`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `fotos`
--
ALTER TABLE `fotos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `fotos_exp`
--
ALTER TABLE `fotos_exp`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `fotos_hab`
--
ALTER TABLE `fotos_hab`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `habitaciones_caracteristicas`
--
ALTER TABLE `habitaciones_caracteristicas`
  ADD UNIQUE KEY `UK_6yk8qj1jxloi7ujv4ed4mtfn6` (`caracteristicas_id`),
  ADD KEY `FKjvynxaqdnlcdup4l9dspn69r5` (`habitaciones_id`);

--
-- Indices de la tabla `habitaciones_fotos_hab`
--
ALTER TABLE `habitaciones_fotos_hab`
  ADD UNIQUE KEY `UK_s553xbr3nr32fheufwn7sr4ss` (`fotos_hab_id`),
  ADD KEY `FKglhsq6wdlmd85ni66v36dyjrq` (`habitaciones_id`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`userid`);

--
-- Indices de la tabla `usuario_reservas`
--
ALTER TABLE `usuario_reservas`
  ADD UNIQUE KEY `UK_6xal95jkvo1rk1ww04hlwl15h` (`reservas_id`),
  ADD KEY `FK3xc7cm4n7f27bvqq5pct8588x` (`usuario_userid`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alojamientos_comentarios`
--
ALTER TABLE `alojamientos_comentarios`
  ADD CONSTRAINT `FKot3ecofvg9s4kxyqqd3s5kgum` FOREIGN KEY (`alojamientos_id`) REFERENCES `alojamientos` (`id`),
  ADD CONSTRAINT `FKr7lg03o9issljqx0d08g7xqwa` FOREIGN KEY (`comentarios_id`) REFERENCES `comentarios` (`id`);

--
-- Filtros para la tabla `alojamientos_filtros`
--
ALTER TABLE `alojamientos_filtros`
  ADD CONSTRAINT `FK4hkxdsftqt8s0pb0kjen96can` FOREIGN KEY (`alojamientos_id`) REFERENCES `alojamientos` (`id`),
  ADD CONSTRAINT `FKgqif5pdau6n4rbd77fq7p3q6e` FOREIGN KEY (`filtros_id`) REFERENCES `filtros` (`id`);

--
-- Filtros para la tabla `alojamientos_fotos`
--
ALTER TABLE `alojamientos_fotos`
  ADD CONSTRAINT `FKcp3gek1q28nyts6u5j0j40km4` FOREIGN KEY (`alojamientos_id`) REFERENCES `alojamientos` (`id`),
  ADD CONSTRAINT `FKnnhm1ij7seha5ex8is6ey5pnf` FOREIGN KEY (`fotos_id`) REFERENCES `fotos` (`id`);

--
-- Filtros para la tabla `alojamientos_habitaciones`
--
ALTER TABLE `alojamientos_habitaciones`
  ADD CONSTRAINT `FK3gg8y6eckka6wswtnqehefr4a` FOREIGN KEY (`alojamientos_id`) REFERENCES `alojamientos` (`id`),
  ADD CONSTRAINT `FKike708gurksvoy3g2pinq8pkm` FOREIGN KEY (`habitaciones_id`) REFERENCES `habitaciones` (`id`);

--
-- Filtros para la tabla `experiencias_comentarios_exp`
--
ALTER TABLE `experiencias_comentarios_exp`
  ADD CONSTRAINT `FKajm7ywjtmmv4gsnw8cok0a3dn` FOREIGN KEY (`comentarios_exp_id`) REFERENCES `comentarios_ex` (`id`),
  ADD CONSTRAINT `FKp50p470m990gpvp3b7tranh62` FOREIGN KEY (`experiencias_id`) REFERENCES `experiencias` (`id`);

--
-- Filtros para la tabla `experiencias_filtros_exp`
--
ALTER TABLE `experiencias_filtros_exp`
  ADD CONSTRAINT `FK2tffc6kwotmrm8dxn0ta6st3n` FOREIGN KEY (`filtros_exp_id`) REFERENCES `filtros_exp` (`id`),
  ADD CONSTRAINT `FKtn5ef858fyt0jsrfksjuykcj4` FOREIGN KEY (`experiencias_id`) REFERENCES `experiencias` (`id`);

--
-- Filtros para la tabla `experiencias_fotos_exp`
--
ALTER TABLE `experiencias_fotos_exp`
  ADD CONSTRAINT `FKbdhdxt9r5apemummd9e9pw1pk` FOREIGN KEY (`fotos_exp_id`) REFERENCES `fotos_exp` (`id`),
  ADD CONSTRAINT `FKfcfrujv6l477fl8lli3mdex2x` FOREIGN KEY (`experiencias_id`) REFERENCES `experiencias` (`id`);

--
-- Filtros para la tabla `habitaciones_caracteristicas`
--
ALTER TABLE `habitaciones_caracteristicas`
  ADD CONSTRAINT `FK9lgo3ymowtjjj69woy2t1txvu` FOREIGN KEY (`caracteristicas_id`) REFERENCES `caracteristicas` (`id`),
  ADD CONSTRAINT `FKjvynxaqdnlcdup4l9dspn69r5` FOREIGN KEY (`habitaciones_id`) REFERENCES `habitaciones` (`id`);

--
-- Filtros para la tabla `habitaciones_fotos_hab`
--
ALTER TABLE `habitaciones_fotos_hab`
  ADD CONSTRAINT `FKd5nbqbrhxww5e06lrjco6975r` FOREIGN KEY (`fotos_hab_id`) REFERENCES `fotos_hab` (`id`),
  ADD CONSTRAINT `FKglhsq6wdlmd85ni66v36dyjrq` FOREIGN KEY (`habitaciones_id`) REFERENCES `habitaciones` (`id`);

--
-- Filtros para la tabla `usuario_reservas`
--
ALTER TABLE `usuario_reservas`
  ADD CONSTRAINT `FK3xc7cm4n7f27bvqq5pct8588x` FOREIGN KEY (`usuario_userid`) REFERENCES `usuario` (`userid`),
  ADD CONSTRAINT `FKgxg3hffr49nk6d63safdk4dkr` FOREIGN KEY (`reservas_id`) REFERENCES `reservas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
