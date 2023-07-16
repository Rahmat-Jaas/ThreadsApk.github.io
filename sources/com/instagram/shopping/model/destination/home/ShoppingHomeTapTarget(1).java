package com.instagram.shopping.model.destination.home;

import X.AnonymousClass000;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C19187As6;
import X.C86104wH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ShoppingHomeTapTarget extends AnonymousClass0Sf implements Parcelable {
    public static final PCreatorCreatorShape17S0000000_I2_17 CREATOR = new PCreatorCreatorShape17S0000000_I2_17(8);
    public RichDestinationButton A00;
    public RichDestinationChevron A01;

    public final class RichDestinationButton extends AnonymousClass0Sf implements Parcelable {
        public static final PCreatorCreatorShape17S0000000_I2_17 CREATOR = new PCreatorCreatorShape17S0000000_I2_17(9);
        public C19187As6 A00;
        public String A01;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RichDestinationButton) {
                    RichDestinationButton richDestinationButton = (RichDestinationButton) obj;
                    if (!C04220Ms.A0I(this.A01, richDestinationButton.A01) || !C04220Ms.A0I(this.A00, richDestinationButton.A00)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C04220Ms.A0B(parcel, 0);
            parcel.writeString(this.A01);
        }

        public final int hashCode() {
            return C18180wK.A03(this.A01) + AnonymousClass0wJ.A03(this.A00);
        }

        public final String toString() {
            StringBuilder A0s = C18190wL.A0s("RichDestinationButton(text=");
            A0s.append(this.A01);
            A0s.append(AnonymousClass000.A00(87));
            return C86104wH.A0y(this.A00, A0s);
        }

        public RichDestinationButton(Parcel parcel) {
            String readString = parcel.readString();
            if (readString != null) {
                this.A01 = readString;
                this.A00 = null;
                return;
            }
            throw C18180wK.A0a("String text required");
        }

        public RichDestinationButton() {
            this.A01 = "";
            this.A00 = null;
        }
    }

    public final class RichDestinationChevron extends AnonymousClass0Sf implements Parcelable {
        public static final PCreatorCreatorShape17S0000000_I2_17 CREATOR = new PCreatorCreatorShape17S0000000_I2_17(10);
        public C19187As6 A00 = null;

        public RichDestinationChevron(Parcel parcel) {
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof RichDestinationChevron) && C04220Ms.A0I(this.A00, ((RichDestinationChevron) obj).A00));
        }

        public final void writeToParcel(Parcel parcel, int i) {
        }

        public final int hashCode() {
            return AnonymousClass0wJ.A03(this.A00);
        }

        public final String toString() {
            return C86104wH.A0y(this.A00, C18190wL.A0s("RichDestinationChevron(navigationMetadata="));
        }

        public RichDestinationChevron() {
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingHomeTapTarget) {
                ShoppingHomeTapTarget shoppingHomeTapTarget = (ShoppingHomeTapTarget) obj;
                if (!C04220Ms.A0I(this.A01, shoppingHomeTapTarget.A01) || !C04220Ms.A0I(this.A00, shoppingHomeTapTarget.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    public ShoppingHomeTapTarget(Parcel parcel) {
        this.A01 = (RichDestinationChevron) C18180wK.A0A(parcel, RichDestinationChevron.CREATOR.getClass());
        this.A00 = (RichDestinationButton) C18180wK.A0A(parcel, RichDestinationButton.CREATOR.getClass());
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A01) * 31) + C18200wM.A07(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ShoppingHomeTapTarget(chevron=");
        A0s.append(this.A01);
        A0s.append(", button=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public /* synthetic */ ShoppingHomeTapTarget(RichDestinationButton richDestinationButton, RichDestinationChevron richDestinationChevron, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this.A01 = null;
        this.A00 = null;
    }

    public ShoppingHomeTapTarget() {
        this.A01 = null;
        this.A00 = null;
    }
}
