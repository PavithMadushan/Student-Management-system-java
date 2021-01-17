-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 17, 2021 at 08:00 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `smsdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `ADMIN_ID` varchar(50) NOT NULL,
  `ADMIN_NAME` varchar(50) NOT NULL,
  `ADMIN_PW` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`ADMIN_ID`, `ADMIN_NAME`, `ADMIN_PW`) VALUES
('SM/AD/01', 'Nimal', 'admin123'),
('SM/AD/02', 'Priyantha', 'sigma456'),
('SM/AD/03', 'Kamal', 'kamal789'),
('SM/AD/04', 'Ranjith', 'ranjith58');

-- --------------------------------------------------------

--
-- Table structure for table `conduct`
--

DROP TABLE IF EXISTS `conduct`;
CREATE TABLE IF NOT EXISTS `conduct` (
  `COURSE_ID` varchar(20) NOT NULL,
  `TEACH_ID` varchar(20) NOT NULL,
  PRIMARY KEY (`COURSE_ID`,`TEACH_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `conduct`
--

INSERT INTO `conduct` (`COURSE_ID`, `TEACH_ID`) VALUES
('CHEM/R/2020', 'SM/CHEM/008'),
('CHEM/T/2020', 'SM/CHEM/007'),
('COM/R/2020', 'SM/MATH/005'),
('COM/T/2020', 'SM/MATH/005'),
('COM/T/2021', 'SM/MATH/004'),
('PHY/T/2020', 'SM/PHY/001');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `COURSE_ID` varchar(20) NOT NULL,
  `COURSE_NAME` varchar(20) NOT NULL,
  `COURSE_TYPE` varchar(20) NOT NULL,
  `COURSE_DURATION` int(4) NOT NULL,
  `COURSE_DATE` varchar(20) NOT NULL,
  `COURSE_TIME` varchar(10) NOT NULL,
  PRIMARY KEY (`COURSE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`COURSE_ID`, `COURSE_NAME`, `COURSE_TYPE`, `COURSE_DURATION`, `COURSE_DATE`, `COURSE_TIME`) VALUES
('PHY/T/2020', 'physics', 'Theory', 3, 'Monday', '2.00-6.00'),
('COM/T/2021', 'Combined Mathematics', 'Theory', 2, 'Tuesday', '2.00-6.00'),
('COM/T/2020', 'Combined Mathematics', 'Theory', 2, 'Wednesday', '2.00-6.00'),
('COM/R/2020', 'Combined Mathematics', 'Revision', 1, 'Thursday', '2.00-6.00'),
('CHEM/T/2020', 'Chemistry', 'Theory', 2, 'Friday', '2.00-6.00'),
('CHEM/R/2020', 'Chemistry', 'Revision', 1, 'Saturday', '8.00-12.00');

-- --------------------------------------------------------

--
-- Table structure for table `enroll`
--

DROP TABLE IF EXISTS `enroll`;
CREATE TABLE IF NOT EXISTS `enroll` (
  `STU_ID` varchar(13) NOT NULL,
  `COURSE_ID` varchar(11) NOT NULL,
  PRIMARY KEY (`STU_ID`,`COURSE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `enroll`
--

INSERT INTO `enroll` (`STU_ID`, `COURSE_ID`) VALUES
('b nb', 'COM/T/2021'),
('SM/2020/0004', 'PHY/T/2020'),
('SM/2020/T0002', 'COM/T/2021'),
('SM/2020/T0004', 'CHEM/R/2020'),
('SM/2021/R0003', 'COM/T/2021'),
('SM/2021/R0222', 'COM/T/2021'),
('SM/2021/R0308', 'COM/T/2020'),
('SM/2021/T0209', 'PHY/T/2020'),
('SM/2021/T0231', 'CHEM/R/2020'),
('SM/2021/T0451', 'CHEM/T/2020'),
('SM/2022/T0125', 'COM/R/2020');

-- --------------------------------------------------------

--
-- Table structure for table `fee`
--

DROP TABLE IF EXISTS `fee`;
CREATE TABLE IF NOT EXISTS `fee` (
  `FEE_ID` varchar(20) NOT NULL,
  `AMOUNT` int(10) NOT NULL,
  `DATE` date NOT NULL,
  `MONTH` varchar(20) NOT NULL,
  PRIMARY KEY (`FEE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fee`
--

INSERT INTO `fee` (`FEE_ID`, `AMOUNT`, `DATE`, `MONTH`) VALUES
('20200104001', 1500, '2020-01-04', 'January'),
('20201125004', 2000, '2020-11-25', 'November'),
('20201130001', 1500, '2020-11-30', 'November'),
('20201208003', 1500, '2020-12-08', 'December');

-- --------------------------------------------------------

--
-- Table structure for table `fees _pay`
--

DROP TABLE IF EXISTS `fees _pay`;
CREATE TABLE IF NOT EXISTS `fees _pay` (
  `res_no` varchar(11) NOT NULL,
  `s_id` varchar(13) NOT NULL,
  `c_id` varchar(11) NOT NULL,
  `PAY_OR_NOT` varchar(2) NOT NULL,
  PRIMARY KEY (`res_no`,`s_id`,`c_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fees _pay`
--

INSERT INTO `fees _pay` (`res_no`, `s_id`, `c_id`, `PAY_OR_NOT`) VALUES
('20200104001', 'SM/2021/T0231', 'CHEM/R/2020', '1'),
('20201125004', 'SM/2021/T0209', 'PHY/T/2020', ''),
('20201130001', 'SM/2021/R0308', 'COM/T/2020', ''),
('20201208003', 'SM/2021/R0200', 'COM/T/2021', '');

-- --------------------------------------------------------

--
-- Table structure for table `pay`
--

DROP TABLE IF EXISTS `pay`;
CREATE TABLE IF NOT EXISTS `pay` (
  `FEE_ID` int(10) NOT NULL AUTO_INCREMENT,
  `STU_ID` varchar(15) NOT NULL,
  `COURSE_ID` varchar(15) NOT NULL,
  `MONTH` varchar(10) NOT NULL,
  PRIMARY KEY (`FEE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `STU_ID` varchar(20) NOT NULL,
  `STU_FNAME` varchar(20) NOT NULL,
  `STU_LNAME` varchar(20) NOT NULL,
  `STU_GEN` varchar(11) NOT NULL,
  `STU_DOB` varchar(11) NOT NULL,
  `STU_ADDRESS` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`STU_ID`, `STU_FNAME`, `STU_LNAME`, `STU_GEN`, `STU_DOB`, `STU_ADDRESS`) VALUES
('SM/2021/R0003', 'SDDSV', 'SDVDVS', 'Female', '2021-01-19', 'SDVDSV'),
('SM/2021/T0002', 'Ashan', 'Gunarathne', '0', '0', 'No.2/4,Wijaya Road,Kiridiwela'),
('SM/2021/T0003', 'Chathura', 'Perera', '0', '0', 'No.5,Bandaranayake Road,Veyangoda'),
('SM/2021/T0004', 'Sheedh', 'Mohomad', '0', '0', 'No.50,train Road,Malwana'),
('SM/2021/T0005', 'Fathima', 'Ajwadh', '0', '0', 'No.2,first  Road,Akkareipaththu'),
('SM/2021/T0006', 'Sutharshan', 'Rajasekara', '0', '0', 'No.123,Main Road,Madakalapu'),
('SM/2021/T0007', 'Tharshika', 'Elangowa', '0', '0', 'No.3,Church Road,Trinkomalee'),
('SM/2021/T0008', 'Janith', 'Ekanayake', '0', '0', 'No.14,Nidhahas Road,Minuwangoda'),
('SM/2021/T0009', 'Anupa', 'Rajapaksha', '0', '0', 'No.7/9,Next Road,Horana'),
('SM/2021/T0010', 'Nisanasala', 'Dissanayake', '0', '0', 'No.10,Hospital Road,Hambanthota'),
('asd', 'asd', 'adssad', 'Female', '2021-01-26', 'sa'),
('SM/2020/T0002', 'm,ddzz', '', 'Female', '2021-01-24', ''),
('SM/2020/0004', 'ASD', 'ASDSA', 'Male', '2021-01-12', 'SA'),
('SM/2020/T0004', 'jkjjghhgjhghjh', 'jkjl', 'Female', '2021-01-18', 'jkjk'),
('b nb', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `student_contact`
--

DROP TABLE IF EXISTS `student_contact`;
CREATE TABLE IF NOT EXISTS `student_contact` (
  `STU_ID` varchar(20) NOT NULL,
  `STU_TELE` varchar(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_contact`
--

INSERT INTO `student_contact` (`STU_ID`, `STU_TELE`) VALUES
('SM/2021/T0001', '0322222222'),
('SM/2021/T0002', '762354897'),
('SM/2021/T0003', '775236985'),
('SM/2021/T0004', '725638741'),
('SM/2021/T0005', '714794162'),
('SM/2021/T0006', '750317856'),
('SM/2021/T0007', '701235796'),
('SM/2021/T0008', '784567923'),
('SM/2021/T0009', '701247956'),
('SM/2021/T0010', '786794231'),
('SM/2021/R0003', '0336521459'),
('SM/2020/T0002', ''),
('SM/2020/0004', '0213654263'),
('SM/2020/T0004', '0231542625'),
('b nb', '');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE IF NOT EXISTS `teacher` (
  `TEACH_ID` varchar(20) NOT NULL,
  `TEACH_FNAME` varchar(20) NOT NULL,
  `TEACH_LNAME` varchar(20) NOT NULL,
  `TEACH_ADDRESS` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`TEACH_ID`, `TEACH_FNAME`, `TEACH_LNAME`, `TEACH_ADDRESS`) VALUES
('SM/PHY/001 ', 'Mr.Nihal', 'Nishshanka', 'No.7,Mihidu Mawatha,Wathupitiwala'),
('SM/PHY/002 ', 'Mr.Nihal', 'Perera', 'No.14,First Road,Nittambuwa'),
('SM/PHY/003 ', 'Mr.Dammika', '', 'No.9/5,Banduragoda Mawatha,Gampaha'),
('SM/MATH/004 ', 'Mr.Pavithra', 'Wijesinghe', 'No.09,Nidahas Mawatha,Rambukkana'),
('SM/MATH/005 ', 'Mr.Hasitha', 'Kularathne', 'No.6/8,Next Road,Horana'),
('SM/MATH/006 ', 'Mr.Sidath', 'Withanage', 'No.1,Naranwaththa Road,Matara'),
('SM/CHEM/007 ', 'Mr.Ruwan', 'Munasinghe', 'No.5/8,Town Road,Kaluthara'),
('SM/CHEM/008 ', 'Mr.Nihal', 'Ramanayake', 'No.20,Samagi Mawatha,Anuradhapura'),
('SM/CHEM/009 ', 'Mrs.Pavithra', 'Ranaweera', 'No.5,3rd road,Kurunegalle');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_contact`
--

DROP TABLE IF EXISTS `teacher_contact`;
CREATE TABLE IF NOT EXISTS `teacher_contact` (
  `TEACH_ID` varchar(11) NOT NULL,
  `TEACH_TELE` varchar(10) NOT NULL,
  PRIMARY KEY (`TEACH_ID`,`TEACH_TELE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher_contact`
--

INSERT INTO `teacher_contact` (`TEACH_ID`, `TEACH_TELE`) VALUES
('SM/CHEM/007', '0775505560'),
('SM/CHEM/009', '0715505065'),
('SM/MATH/006', '0725504460'),
('SM/PHY/001 ', '0715505560'),
('SM/PHY/002', '0765505560'),
('SM/PHY/003', '0715501110');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_qualification`
--

DROP TABLE IF EXISTS `teacher_qualification`;
CREATE TABLE IF NOT EXISTS `teacher_qualification` (
  `TEACH_ID` varchar(20) NOT NULL,
  `TEACH_MAJOR` varchar(20) NOT NULL,
  PRIMARY KEY (`TEACH_ID`,`TEACH_MAJOR`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher_qualification`
--

INSERT INTO `teacher_qualification` (`TEACH_ID`, `TEACH_MAJOR`) VALUES
('SM/CHEM/007', 'Chemistry'),
('SM/CHEM/008', 'Chemistry'),
('SM/CHEM/009', 'Chemistry'),
('SM/MATH/004', 'Mathematics'),
('SM/MATH/005', 'Mathematics'),
('SM/MATH/006', 'Mathematics'),
('SM/PHY/001', 'Physics'),
('SM/PHY/002', 'Physics'),
('SM/PHY/003', 'Physics');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
