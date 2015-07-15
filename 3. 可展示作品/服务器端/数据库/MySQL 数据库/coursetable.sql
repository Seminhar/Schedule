-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 2015-06-02 20:17:46
-- 服务器版本： 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `coursetable`
--

-- --------------------------------------------------------

--
-- 表的结构 `myuser`
--

CREATE TABLE IF NOT EXISTS `myuser` (
`uId` int(11) NOT NULL,
  `uName` varchar(20) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `uPassword` varchar(16) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `uKey` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `myuser`
--

INSERT INTO `myuser` (`uId`, `uName`, `uPassword`, `uKey`) VALUES
(2, 'kk', 'kkk', ''),
(15, 'nn', 'j', ''),
(16, 'nnh', 'j', ''),
(17, 'm', 'm', ''),
(18, '??', 'xx', ''),
(19, 'Mama', 'm', ''),
(20, 'Baba', 'b', ''),
(21, 'Gege', 'g', ''),
(22, 'Xx', '123456', ''),
(23, 'Xx', '123456', ''),
(24, 'Ff', '123456', ''),
(25, 'dd', '123456', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `myuser`
--
ALTER TABLE `myuser`
 ADD PRIMARY KEY (`uId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `myuser`
--
ALTER TABLE `myuser`
MODIFY `uId` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=26;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
