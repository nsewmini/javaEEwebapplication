-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 07, 2022 at 09:21 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dea`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `acceptg1` (IN `username` VARCHAR(255))   BEGIN
Start TRANSACTION;
INSERT INTO grade01staff
SELECT uname,fullname,empid,password from temp_staff_details
WHERE uname = username;





INSERT INTO stafflogin
SELECT uname, password from temp_staff_details
WHERE uname = username;





DELETE
FROM temp_staff_details
WHERE uname = username;
COMMIT;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `acceptg2` (IN `username` VARCHAR(255))   BEGIN
Start TRANSACTION;
INSERT INTO grade02staff
SELECT uname,fullname,empid,password from temp_staff_details
WHERE uname = username;





INSERT INTO stafflogin02
SELECT uname, password from temp_staff_details
WHERE uname = username;





DELETE
FROM temp_staff_details
WHERE uname = username;
COMMIT;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE `adminlogin` (
  `uname` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`uname`, `password`) VALUES
('admin', '0192023a7bbd73250516f069df18b500');

-- --------------------------------------------------------

--
-- Table structure for table `bookflight`
--

CREATE TABLE `bookflight` (
  `uname` varchar(80) NOT NULL,
  `tripmethod` varchar(30) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `passportid` varchar(100) NOT NULL,
  `email` varchar(80) NOT NULL,
  `departure` varchar(100) NOT NULL,
  `arrival` varchar(100) NOT NULL,
  `departuredate` varchar(20) NOT NULL,
  `returndate` varchar(20) NOT NULL,
  `classtype` varchar(50) NOT NULL,
  `adult` varchar(50) NOT NULL,
  `child` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bookflight`
--

INSERT INTO `bookflight` (`uname`, `tripmethod`, `fullname`, `passportid`, `email`, `departure`, `arrival`, `departuredate`, `returndate`, `classtype`, `adult`, `child`) VALUES
('sathsarani', 'Rounded trip', 'sewmini sathsarani', '5715635625', 'sewminisathsarani@gmail.com', 'Australia', 'New Zeland', '2022.10.23', '2022.10.24', 'Business', '3', '3'),
('Rusiru', 'Rounded trip', 'rusiru abeyrathna', '2837467328', 'rusiruabeyrathna@gmail.com', 'America', 'New Zeland', '2022.10.26', '2022.10.27', 'Business', '2', '3'),
('Navodya', 'Rounded trip', 'sewmini navodya', '57263525765', 'novodyasewmini@gmail.com', 'canada', 'america', '2022.10.27', '2022.10.28', 'Business', '1', '4'),
('sandali', 'Rounded trip', 'sandali silva', '7663467385', 'sandalisilva@gmail.com', 'Rusia', 'japan', '2022.10.28', '2022.10.29', 'Business', '3', '3'),
('kaushitha', 'Rounded trip', 'kasun kaushitha', '5643647854', 'kasunkaushitha@gmail.com', 'Dubai', 'Canada', '2022.10.28', '2022.10.29', 'Business', '1', '4'),
('chathurika', 'Rounded trip', 'chathurika gunasekara', '7678863546', 'chathurikagunasekara@gmail.com', 'china', 'Korea', '2022.10.30', '2022.10.30', 'Business', '2', '3');

-- --------------------------------------------------------

--
-- Table structure for table `contactmsg`
--

CREATE TABLE `contactmsg` (
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phoneno` varchar(100) NOT NULL,
  `messege` varchar(254) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `contactmsg`
--

INSERT INTO `contactmsg` (`name`, `email`, `phoneno`, `messege`) VALUES
('Rusiru', 'rusiruabeyrathna@gmail.com', '07653762378', 'Please help'),
('sathsarani', 'sewminisathsarani@gmail.com', '07573283724', 'can you help me'),
('cathurika', 'chathurikagunasekara@gmail.com', '0783435674', 'please find my ticket details'),
('kaushitha', 'kasunkaushitha@gmail.com', '0784356478', 'Flight type pls'),
('Navodya', 'novodyasewmini@gmail.com', '0763436754', 'please help me');

-- --------------------------------------------------------

--
-- Table structure for table `flightsinformations`
--

CREATE TABLE `flightsinformations` (
  `flightid` varchar(100) NOT NULL,
  `flightfrom` varchar(150) NOT NULL,
  `flightto` varchar(150) NOT NULL,
  `departdate` varchar(100) NOT NULL,
  `returndate` varchar(100) NOT NULL,
  `time` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `flightsinformations`
--

INSERT INTO `flightsinformations` (`flightid`, `flightfrom`, `flightto`, `departdate`, `returndate`, `time`) VALUES
('KA26367', 'fgqwgwt', 'ydtye', '2022.10.20', '2022.10.22', '11.00 A.M'),
('SA6326762', 'ywegdb', 'gwdwt', '2022.10.25', '2022.10.26', '1.00 p.m'),
('WA632564', 'bhdegbhj', 'shgvwhd', '2022.10.25', '2022.10.27', '3.00 a.m'),
('DS52635', 'hgvdgee', 'dheutdye', '2022.11.01', '2022.11.03', '4.00 p.m'),
('FS273277', 'hshuyde', 'jeuidie', '2022.11.04', '2022.11.06', '2.00 a.m'),
('EA11237', 'hubdeyy', 'queikje', '2022.11.07', '2022.11.08', '7.00 p.m');

-- --------------------------------------------------------

--
-- Table structure for table `flightstatus`
--

CREATE TABLE `flightstatus` (
  `flightid` varchar(100) NOT NULL,
  `flightfrom` varchar(150) NOT NULL,
  `flightto` varchar(150) NOT NULL,
  `time` varchar(100) NOT NULL,
  `flghtstatus` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `flightstatus`
--

INSERT INTO `flightstatus` (`flightid`, `flightfrom`, `flightto`, `time`, `flghtstatus`) VALUES
('AHS37485', 'india', 'colombo', '4.00 a.m', 'on time'),
('ASA2634', 'canada', 'australia', '4.00p.m', 'not available'),
('FG56367', 'canada', 'Australia', '3.00 a.m', 'on time'),
('FD37464', 'chicago', 'Amsterdan', '7.00 a.m', 'on time'),
('EA678237', 'Bangaladesh', 'America', '7.00 a.m', 'on time');

-- --------------------------------------------------------

--
-- Table structure for table `grade01staff`
--

CREATE TABLE `grade01staff` (
  `uname` varchar(100) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `empid` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `grade01staff`
--

INSERT INTO `grade01staff` (`uname`, `fullname`, `empid`, `password`) VALUES
('sathsarani', 'DA sathsarani', '1234', '1234'),
('Rusiru', 'rusiru abeyrathna', '4321', '5678'),
('Navodya', 'sewmini navodya', '34567', '87654'),
('kaushitha', 'kasun kaushitha', '788976', '345345'),
('cathurika', 'cathurika gunasekara', '65478', '98765'),
('Sandali', 'sandali silva', '576893', '267848');

-- --------------------------------------------------------

--
-- Table structure for table `grade02staff`
--

CREATE TABLE `grade02staff` (
  `uname` varchar(100) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `empid` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `grade02staff`
--

INSERT INTO `grade02staff` (`uname`, `fullname`, `empid`, `password`) VALUES
('Rusiru', 'rusiru abeyrathna', '5678', '678786'),
('sathsarani', 'sewmini sathsarani', '767877', '673654'),
('Navodya', 'sewmini navodya', '72883', '7463478'),
('Sandali', 'sandali silva', '87364738', '6437888'),
('Chathurika', 'chaturika gunasekara', '83298444', '736437');

-- --------------------------------------------------------

--
-- Table structure for table `stafflogin`
--

CREATE TABLE `stafflogin` (
  `uname` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stafflogin`
--

INSERT INTO `stafflogin` (`uname`, `password`) VALUES
('bhjed', 'ibwu738949hgeh '),
('hdjefjk', 'njbbwu7423980bjhc'),
('bhbhkj', 'nhdb784u293ndhev74'),
('jehbfh', 'hjdb73492huwhwfe'),
('bhewh', 'eub748457bhsdgvf'),
('bdgewvfh', 'bhr789476474rhhdgh'),
('nfbjnj', 'hswbgd37791hbhjfgvd'),
('njnjnj', 'nenjn53895njk'),
('nerie', 'uiri88485njch'),
('riuen', 'njnfkg95034kjgnrj'),
('nkwnej', 'njfjbrjr8343hjhkf'),
('fhjfnf', 'nbgiw890325niu');

-- --------------------------------------------------------

--
-- Table structure for table `stafflogin02`
--

CREATE TABLE `stafflogin02` (
  `uname` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stafflogin02`
--

INSERT INTO `stafflogin02` (`uname`, `password`) VALUES
('je2ornf', 'jenwf4940jfhjnij958n'),
('jnfjf', 'ggcdgf7365sfhg'),
('ggvdgdt', 'uyhytdte7873gvd'),
('gvdgfc', 'gywqdy7737ggydc'),
('nfjnrk', 'njkn857jhbfhbfhu'),
('hbdhje', 'ndwui738019njhdhf'),
('njbdwjhj', 'bhhj8804983hdgfhjd'),
('jnjbdjh', 'njqb74895hdbhf'),
('jdqjk', 'njqq8914091hjfj'),
('hhxbs', 'khbdu539459hafj'),
('bqhjhf', 'hdhj8945nchbj'),
('bdwehfbwj', 'hb8u4hwdfbhhebwf'),
('ndehbjd', 'jhbd89998jhdk'),
('ndhjbe', 'njjnkm89384hdbdshbq');

-- --------------------------------------------------------

--
-- Table structure for table `temp_staff_details`
--

CREATE TABLE `temp_staff_details` (
  `uname` varchar(100) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `empid` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `temp_staff_details`
--

INSERT INTO `temp_staff_details` (`uname`, `fullname`, `empid`, `password`) VALUES
('Rusiru', 'rusiru abeyrathna', '12345', 'bswqdt789767vhbjha'),
('sathsarani', 'sewmini sathsarani', '654321', 'gwvy739gdwcf72v'),
('kaushitha', 'kasun kaushitha', '876543', 'vwvyh4789hdshgq'),
('sandali', 'sandali silva', '45678', 'bwhv328949bwgfvwj'),
('chathurika', 'chaturika gunasekara', '657838', 'njdbew8480329jbhjf ');

-- --------------------------------------------------------

--
-- Table structure for table `temp_staff_login`
--

CREATE TABLE `temp_staff_login` (
  `uname` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `temp_staff_login`
--

INSERT INTO `temp_staff_login` (`uname`, `password`) VALUES
('rusiru', 'nhbhxjjnjbqkjh73489hhgehf'),
('jymy', 'hwgfvhjnhbfj83994befgj'),
('sathsarani', 'bwhbe78190hfuhja'),
('cham', 'hbew3ii483bhhdjjn'),
('kaushitha', 'bhdfvgh84988hjbdj'),
('Navodya', 'ndhwjn89499jaihwj'),
(' sandali', 'djbfkjw94i90njdjfe'),
('sewmini', 'ndbdjk84994uhfbdj'),
('chaturika', 'nwbdhjjn8949nhwb'),
('elise', 'nskj3894jnsnkk');

-- --------------------------------------------------------

--
-- Table structure for table `ticketdetails`
--

CREATE TABLE `ticketdetails` (
  `ticketid` varchar(100) NOT NULL,
  `flightid` varchar(100) NOT NULL,
  `uname` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ticketdetails`
--

INSERT INTO `ticketdetails` (`ticketid`, `flightid`, `uname`) VALUES
('T834885490', 'AE83439', 'Rusiru'),
('T82939', 'WE43859', 'sathsarani'),
('T97843', 'TR88389', 'kaushitha'),
('T899873', 'FRu4342y', 'sandali'),
('T80384', 'DS839374', 'sewmini'),
('T73483', 'RT734648', 'CHathurika');

-- --------------------------------------------------------

--
-- Table structure for table `userdetails`
--

CREATE TABLE `userdetails` (
  `uname` varchar(100) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`uname`, `fullname`, `email`, `password`) VALUES
('sathsarani', 'sewmini', 'sathsarani@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055'),
('rusiru', 'rusiru abeyrathna', 'rusiruanjithaabeyrathna@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055'),
('kasun', 'kasun kaushitha', 'kasunkaushitha@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055'),
('sandali', 'sandali silva', 'sandalisilva@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055'),
('chathurika', 'chathurika ruwani', 'chathurikaruwani@gamil.com', '81dc9bdb52d04dc20036dbd8313ed055'),
('novodya', 'novodya sewmini', 'novodyasewmini@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055');

-- --------------------------------------------------------

--
-- Table structure for table `userlogin`
--

CREATE TABLE `userlogin` (
  `uname` varchar(35) NOT NULL,
  `password` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userlogin`
--

INSERT INTO `userlogin` (`uname`, `password`) VALUES
('Rusiru', 'jksndj827746dbgvyh'),
('Sathsarani', 'nshdhq774337huybakj'),
('kaushitha', 'hjbsuqvd1834huqbdv'),
('sewmini', 'hveue477548ngv'),
('chathurika', 'nnhjf64785bhdvgf'),
('Navodya', 'wbunfkwnr748hgvewfj');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
