package vn.ptit.common;

public interface Constants {

    // LED color constants
    Integer LED_NORMAL = 0;
    Integer LED_WARNING = 1;

    // Action to ESP32 constants
    Integer LED_ON = 0;
    Integer LED_OFF = 1;
    Integer LED_NOTIFY = 2;
    Integer LCD_ON = 3;
    Integer LCD_OFF = 4;
    Integer NOTIFY = 5;
    Integer CHANGE_REFRESH_TIME = 6;

    // Time to analyze data
    Integer ANALYZE_LAST_HOUR = 5; // Every 5 minutes
    Integer ANALYZE_LAST_DAY = 120; // Every 2 hours
    Integer ANALYZE_LAST_WEEK = 24 * 60; // Every day
    Integer ANALYZE_LAST_MONTH = 24 * 60; // Every day
    Long ANALYZE_REFRESH_DATA_TIME = 60 * 60L; // 1 hour
}
