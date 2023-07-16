package com.instagram.ui.primer;

import X.C04220Ms;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;

public abstract class IconConfig implements Parcelable {

    public final class IconWithTextConfig extends IconConfig {
        public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(44);
        public final int A00;
        public final String A01;

        public IconWithTextConfig(int i, String str) {
            C04220Ms.A0B(str, 2);
            this.A00 = i;
            this.A01 = str;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof IconWithTextConfig) {
                    IconWithTextConfig iconWithTextConfig = (IconWithTextConfig) obj;
                    if (this.A00 != iconWithTextConfig.A00 || !C04220Ms.A0I(this.A01, iconWithTextConfig.A01)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C04220Ms.A0B(parcel, 0);
            parcel.writeInt(this.A00);
            parcel.writeString(this.A01);
        }

        public final int hashCode() {
            return C18210wN.A05(this.A01, this.A00 * 31);
        }
    }

    public final class SimpleIconConfig extends IconConfig {
        public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(45);
        public final int A00;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof SimpleIconConfig) && this.A00 == ((SimpleIconConfig) obj).A00);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C04220Ms.A0B(parcel, 0);
            parcel.writeInt(this.A00);
        }

        public final int hashCode() {
            return this.A00;
        }

        public SimpleIconConfig(int i) {
            this.A00 = i;
        }
    }
}
