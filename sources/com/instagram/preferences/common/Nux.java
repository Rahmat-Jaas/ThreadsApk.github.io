package com.instagram.preferences.common;

public @interface Nux {
    boolean getBooleanAlwaysReturn() default true;

    int getIntAlwaysReturn() default 100;
}
