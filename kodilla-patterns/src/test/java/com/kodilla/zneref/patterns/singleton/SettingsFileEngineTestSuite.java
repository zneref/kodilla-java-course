package com.kodilla.zneref.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SettingsFileEngineTestSuite {
    @BeforeClass
    public static void openSettingsFile() {
     //   SettingsFileEngine.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
      //  SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        SettingsFileEngine settingsFileEngine = SettingsFileEngine.getInstance();
        SettingsFileEngine settingsFileEngine1 = SettingsFileEngine.getInstance();
        settingsFileEngine.open("myapp.settings");
        System.out.println("Opened: " + settingsFileEngine.getFileName());
        System.out.println("Opened: " + settingsFileEngine1.getFileName());
        //Then
        Assert.assertEquals("myapp.settings", settingsFileEngine1.getFileName());
    }

    @Test
    public void testLoadSettings() {
        //Given
        //When
        boolean result = SettingsFileEngine.getInstance().loadSettings();
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //Given
        //When
        boolean result = SettingsFileEngine.getInstance().saveSettings();
        //Then
        Assert.assertTrue(result);
    }


}