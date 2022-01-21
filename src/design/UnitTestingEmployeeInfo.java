package design;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

public class UnitTestingEmployeeInfo {


        @Test
        public void testCalculateEmployeeBonus() {
            int expectedResult = 12000;
            int actualResult = EmployeeInfo.calculateEmployeeBonus(120000, "best");
            Assert.assertEquals( expectedResult, actualResult);
            System.out.println("test passed");
        }

        @Test
        public void testCalculateEmployeePension() throws ParseException {
            int expectedResult = 1000;
            int actualResult = EmployeeInfo.calculateEmployeePension(5,120000);
            Assert.assertEquals(expectedResult, actualResult);
            System.out.println("test passed");
        }

    }


