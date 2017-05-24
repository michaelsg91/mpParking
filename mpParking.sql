-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 17, 2017 at 04:20 PM
-- Server version: 10.0.29-MariaDB-0ubuntu0.16.04.1
-- PHP Version: 7.0.15-0ubuntu0.16.04.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mpParking`
--

-- --------------------------------------------------------

--
-- Table structure for table `campos`
--

CREATE TABLE `campos` (
  `idTipoVeh` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `campos`
--

INSERT INTO `campos` (`idTipoVeh`, `cantidad`) VALUES
(1, 20),
(2, 10);

-- --------------------------------------------------------

--
-- Table structure for table `factura`
--

CREATE TABLE `factura` (
  `idFactura` int(11) NOT NULL,
  `idRecibo` int(11) DEFAULT NULL,
  `idUsuario` int(11) NOT NULL,
  `fechaSalida` date NOT NULL,
  `horaSalida` time NOT NULL,
  `subtotal` decimal(15,2) NOT NULL,
  `iva` decimal(15,2) NOT NULL,
  `total` decimal(15,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `factura`
--

INSERT INTO `factura` (`idFactura`, `idRecibo`, `idUsuario`, `fechaSalida`, `horaSalida`, `subtotal`, `iva`, `total`) VALUES
(1, 1, 1, '2017-03-29', '19:52:51', '24465.00', '3914.40', '24465.00'),
(2, 2, 1, '2017-03-29', '19:56:46', '17538.00', '2806.08', '17538.00'),
(3, 3, 1, '2017-03-30', '12:51:58', '1776.00', '337.44', '1776.00'),
(4, 4, 1, '2017-03-30', '12:52:20', '2415.00', '458.85', '2415.00'),
(5, 7, 1, '2017-03-30', '13:09:15', '1554.00', '295.26', '1554.00'),
(6, 5, 1, '2017-03-30', '13:09:22', '3360.00', '638.40', '3360.00'),
(7, 6, 1, '2017-03-30', '13:09:25', '2294.00', '435.86', '2294.00'),
(8, 8, 1, '2017-03-30', '15:19:09', '3045.00', '578.55', '3045.00'),
(9, 10, 1, '2017-03-30', '16:39:05', '10710.00', '2034.90', '10710.00'),
(10, 12, 1, '2017-03-30', '16:39:10', '148.00', '28.12', '148.00'),
(11, 11, 1, '2017-03-30', '16:39:14', '1260.00', '239.40', '1260.00'),
(12, 9, 1, '2017-03-30', '16:39:19', '7696.00', '1462.24', '7696.00'),
(13, 13, 1, '2017-03-31', '12:27:24', '122640.00', '23301.60', '122640.00'),
(14, 14, 2, '2017-03-31', '13:54:50', '4958.00', '942.02', '4958.00'),
(15, 15, 1, '2017-04-07', '13:42:03', '431198.00', '81927.62', '431198.00'),
(16, 16, 1, '2017-04-07', '14:54:00', '7770.00', '1476.30', '7770.00'),
(17, 17, 1, '2017-04-07', '15:04:48', '222.00', '42.18', '222.00'),
(18, 18, 1, '2017-04-07', '15:09:56', '420.00', '79.80', '499.80'),
(19, 19, 1, '2017-04-26', '12:36:22', '418635.00', '79540.65', '498175.65'),
(20, 20, 1, '2017-04-26', '12:36:25', '418635.00', '79540.65', '498175.65'),
(21, 22, 1, '2017-05-02', '21:15:08', '45880.00', '8717.20', '54597.20'),
(22, 21, 2, '2017-05-06', '13:10:17', '619185.00', '117645.15', '736830.15'),
(23, 23, 1, '2017-05-16', '13:41:08', '1458466.00', '277108.54', '1735574.54'),
(24, 24, 1, '2017-05-16', '13:41:10', '1068412.00', '202998.28', '1271410.28');

-- --------------------------------------------------------

--
-- Table structure for table `marca`
--

CREATE TABLE `marca` (
  `idMarca` int(11) NOT NULL,
  `idTipoVeh` int(11) NOT NULL,
  `marca` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marca`
--

INSERT INTO `marca` (`idMarca`, `idTipoVeh`, `marca`) VALUES
(1, 1, 'Audi'),
(2, 1, 'BMW'),
(3, 1, 'Chevrolet'),
(4, 1, 'Citroen'),
(5, 1, 'Daihatsu'),
(6, 1, 'Dodge'),
(7, 1, 'Fiat'),
(8, 1, 'Ford'),
(9, 1, 'Honda'),
(10, 1, 'Hyundai'),
(11, 1, 'Jeep'),
(12, 1, 'Kia'),
(13, 1, 'Mazda'),
(14, 1, 'Mercedez-Benz'),
(15, 1, 'Mini'),
(16, 1, 'Mitsubishi'),
(17, 1, 'Nissan'),
(18, 1, 'Peugeot'),
(19, 1, 'Porsche'),
(20, 1, 'Renault'),
(21, 1, 'Seat'),
(22, 1, 'Skoda'),
(23, 1, 'SsangYoung'),
(24, 1, 'Subaru'),
(25, 1, 'Toyota'),
(26, 1, 'Volkswagen'),
(27, 2, 'AKT'),
(28, 2, 'Bajaj'),
(29, 2, 'Honda'),
(30, 2, 'Kawasaki'),
(31, 2, 'Keeway'),
(32, 2, 'KTM'),
(33, 2, 'Kymco'),
(34, 2, 'LML'),
(35, 2, 'Piaggio'),
(36, 2, 'Sachs'),
(37, 2, 'Suzuki'),
(38, 2, 'TVS'),
(39, 2, 'United Motors'),
(40, 2, 'Yamaha');

-- --------------------------------------------------------

--
-- Table structure for table `recibo`
--

CREATE TABLE `recibo` (
  `idRecibo` int(11) NOT NULL,
  `idVeh` varchar(50) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `idTipoTar` int(11) NOT NULL,
  `idTipoVeh` int(11) NOT NULL,
  `fechaEntrada` date NOT NULL,
  `horaEntrada` time NOT NULL,
  `idMarca` int(11) DEFAULT NULL,
  `idCliente` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `recibo`
--

INSERT INTO `recibo` (`idRecibo`, `idVeh`, `idUsuario`, `idTipoTar`, `idTipoVeh`, `fechaEntrada`, `horaEntrada`, `idMarca`, `idCliente`) VALUES
(1, 'ASD-23F', 1, 1, 1, '2017-03-29', '16:01:00', 3, NULL),
(2, 'QWE-57E', 1, 1, 2, '2017-03-29', '16:01:00', 3, NULL),
(3, '256-DE1', 1, 1, 2, '2017-03-30', '12:29:00', 27, NULL),
(4, '268-SC9', 1, 1, 1, '2017-03-30', '12:30:00', 6, 1122838523),
(5, 'DFS-34F', 1, 1, 1, '2017-03-30', '12:38:00', 20, NULL),
(6, 'DFS-34R', 1, 1, 2, '2017-03-30', '12:39:00', 40, NULL),
(7, 'ASD-34E', 1, 1, 2, '2017-03-30', '12:49:00', 29, NULL),
(8, 'ASD-12W', 1, 1, 1, '2017-03-30', '14:51:00', 3, NULL),
(9, 'QWE-59B', 1, 1, 2, '2017-03-30', '14:56:00', 39, NULL),
(10, 'DBU-37D', 1, 1, 1, '2017-03-30', '14:58:00', 2, NULL),
(11, 'ASD-36G', 1, 1, 1, '2017-03-30', '16:28:00', 26, NULL),
(12, 'WER-27C', 1, 1, 2, '2017-03-30', '16:38:00', 27, NULL),
(13, 'asd-23f', 2, 1, 1, '2017-03-30', '17:00:00', 3, NULL),
(14, 'QWE-57E', 1, 1, 2, '2017-03-31', '12:49:00', 29, NULL),
(15, 'QWE-57E', 2, 1, 2, '2017-04-03', '12:36:00', 29, NULL),
(16, 'ASD-23F', 1, 1, 1, '2017-04-07', '13:41:00', 3, NULL),
(17, 'QWE-57E', 2, 1, 2, '2017-04-07', '15:03:00', 29, NULL),
(18, '268-SC9', 1, 1, 1, '2017-04-07', '15:07:00', 6, NULL),
(19, 'DRD-34G', 1, 1, 1, '2017-04-23', '18:10:00', 5, NULL),
(20, '123-ASD', 1, 1, 1, '2017-04-23', '18:10:00', 1, NULL),
(21, '123-ASD', 1, 1, 1, '2017-05-02', '10:54:00', 1, NULL),
(22, '456-FGH', 1, 1, 2, '2017-05-02', '10:56:00', 27, NULL),
(23, '123-ASD', 1, 1, 2, '2017-05-02', '21:13:00', 27, NULL),
(24, '123-ASD', 1, 1, 2, '2017-05-06', '13:04:00', 31, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tarifa`
--

CREATE TABLE `tarifa` (
  `idTipoTar` int(11) NOT NULL,
  `idTipoVeh` int(11) NOT NULL,
  `valorTarifa` decimal(15,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tarifa`
--

INSERT INTO `tarifa` (`idTipoTar`, `idTipoVeh`, `valorTarifa`) VALUES
(1, 1, '105.00'),
(1, 2, '74.00'),
(2, 1, '5000.00'),
(2, 2, '4000.00');

-- --------------------------------------------------------

--
-- Table structure for table `tipoTar`
--

CREATE TABLE `tipoTar` (
  `idTipoTar` int(11) NOT NULL,
  `tarifa` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tipoTar`
--

INSERT INTO `tipoTar` (`idTipoTar`, `tarifa`) VALUES
(2, 'Hora'),
(1, 'Minuto');

-- --------------------------------------------------------

--
-- Table structure for table `tipoVeh`
--

CREATE TABLE `tipoVeh` (
  `idTipoVeh` int(11) NOT NULL,
  `tipoVeh` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tipoVeh`
--

INSERT INTO `tipoVeh` (`idTipoVeh`, `tipoVeh`) VALUES
(1, 'Automovil'),
(2, 'Motocicleta');

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `contra` varchar(255) NOT NULL,
  `habilitado` tinyint(4) NOT NULL,
  `enLinea` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `usuario`, `contra`, `habilitado`, `enLinea`) VALUES
(1, 'admin', '2468', 1, 0),
(2, 'Michael', 'michael', 1, 0),
(3, 'paula', 'paula', 1, NULL),
(4, 'jeimy', 'jeimy', 1, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `campos`
--
ALTER TABLE `campos`
  ADD PRIMARY KEY (`idTipoVeh`);

--
-- Indexes for table `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`idFactura`),
  ADD UNIQUE KEY `idRecibo` (`idRecibo`),
  ADD KEY `idUsuario` (`idUsuario`);

--
-- Indexes for table `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`idMarca`),
  ADD KEY `idTipoVeh` (`idTipoVeh`);

--
-- Indexes for table `recibo`
--
ALTER TABLE `recibo`
  ADD PRIMARY KEY (`idRecibo`),
  ADD KEY `idUsuario` (`idUsuario`),
  ADD KEY `idTipoTar` (`idTipoTar`),
  ADD KEY `idTipoVeh` (`idTipoVeh`),
  ADD KEY `idMarca` (`idMarca`);

--
-- Indexes for table `tarifa`
--
ALTER TABLE `tarifa`
  ADD PRIMARY KEY (`idTipoTar`,`idTipoVeh`),
  ADD KEY `idTipoVeh` (`idTipoVeh`);

--
-- Indexes for table `tipoTar`
--
ALTER TABLE `tipoTar`
  ADD PRIMARY KEY (`idTipoTar`),
  ADD UNIQUE KEY `tarifa` (`tarifa`);

--
-- Indexes for table `tipoVeh`
--
ALTER TABLE `tipoVeh`
  ADD PRIMARY KEY (`idTipoVeh`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `factura`
--
ALTER TABLE `factura`
  MODIFY `idFactura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- AUTO_INCREMENT for table `marca`
--
ALTER TABLE `marca`
  MODIFY `idMarca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;
--
-- AUTO_INCREMENT for table `recibo`
--
ALTER TABLE `recibo`
  MODIFY `idRecibo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- AUTO_INCREMENT for table `tipoTar`
--
ALTER TABLE `tipoTar`
  MODIFY `idTipoTar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tipoVeh`
--
ALTER TABLE `tipoVeh`
  MODIFY `idTipoVeh` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `campos`
--
ALTER TABLE `campos`
  ADD CONSTRAINT `campos_ibfk_1` FOREIGN KEY (`idTipoVeh`) REFERENCES `tipoVeh` (`idTipoVeh`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`idRecibo`) REFERENCES `recibo` (`idRecibo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `factura_ibfk_2` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`idUsuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marca`
--
ALTER TABLE `marca`
  ADD CONSTRAINT `marca_ibfk_1` FOREIGN KEY (`idTipoVeh`) REFERENCES `tipoVeh` (`idTipoVeh`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `recibo`
--
ALTER TABLE `recibo`
  ADD CONSTRAINT `recibo_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`idUsuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `recibo_ibfk_2` FOREIGN KEY (`idTipoTar`) REFERENCES `tipoTar` (`idTipoTar`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `recibo_ibfk_3` FOREIGN KEY (`idTipoVeh`) REFERENCES `tipoVeh` (`idTipoVeh`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `recibo_ibfk_4` FOREIGN KEY (`idMarca`) REFERENCES `marca` (`idMarca`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tarifa`
--
ALTER TABLE `tarifa`
  ADD CONSTRAINT `tarifa_ibfk_1` FOREIGN KEY (`idTipoTar`) REFERENCES `tipoTar` (`idTipoTar`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tarifa_ibfk_2` FOREIGN KEY (`idTipoVeh`) REFERENCES `tipoVeh` (`idTipoVeh`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
