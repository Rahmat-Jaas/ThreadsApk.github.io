package org.microg.safeparcel;

import android.os.Parcelable;

public interface SafeParcelable extends Parcelable {

    public @interface Field {
        boolean mayNull() default false;

        Class subClass() default SafeParcelable.class;

        boolean useValueParcel() default false;

        int value();

        long versionCode() default -1;
    }
}
