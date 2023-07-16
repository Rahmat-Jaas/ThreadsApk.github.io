package com.facebook.redex;

import X.C147198oZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.businessextension.jscalls.GetNonceJSBridgeCall;
import com.facebook.businessextension.jscalls.HideAutofillBarJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall;

public class IDxObjectShape133S0000000_2_I2 implements Parcelable.Creator, C147198oZ {
    public final int A00;

    public IDxObjectShape133S0000000_2_I2(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new GetNonceJSBridgeCall(parcel);
            case 1:
                return new HideAutofillBarJSBridgeCall(parcel);
            case 2:
                return new RequestAutofillJSBridgeCall(parcel);
            default:
                return new SaveAutofillDataJSBridgeCall(parcel);
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new GetNonceJSBridgeCall[i];
            case 1:
                return new HideAutofillBarJSBridgeCall[i];
            case 2:
                return new RequestAutofillJSBridgeCall[i];
            default:
                return new SaveAutofillDataJSBridgeCall[i];
        }
    }
}
