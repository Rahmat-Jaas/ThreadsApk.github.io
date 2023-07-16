package com.facebook.wearable.common.comms.rtc.model2.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C32492Cb;
import X.C35606Iyi;
import X.I17;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.redex.PCreatorCreatorShape2S0000000_I2_2;
import java.util.ArrayList;
import java.util.HashSet;

public class Call implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape2S0000000_I2_2(52);
    public final CallIntent A00;
    public final DisconnectIntent A01;
    public final DisconnectIntent A02;
    public final ThreadInfo A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final HashSet A0B;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Call) {
            Call call = (Call) obj;
            if (this.A07 == call.A07 && this.A09.equals(call.A09)) {
                String str = this.A0A;
                String str2 = call.A0A;
                if (str != null ? str.equals(str2) : str2 == null) {
                    if (this.A06 != call.A06 || !this.A00.equals(call.A00) || !this.A03.equals(call.A03) || this.A08 != call.A08 || this.A05 != call.A05 || this.A04 != call.A04 || !this.A0B.equals(call.A0B) || !this.A02.equals(call.A02) || !this.A01.equals(call.A01)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        String str2;
        String str3;
        int intValue = this.A07.intValue();
        switch (intValue) {
            case 1:
                str = "IGDIRECT";
                break;
            case 2:
                str = "WHATSAPP";
                break;
            default:
                str = "MESSENGER";
                break;
        }
        int A072 = (AnonymousClass0wJ.A07(this.A09, C18210wN.A00(str.hashCode() + intValue)) + AnonymousClass0wJ.A06(this.A0A)) * 31;
        int intValue2 = this.A06.intValue();
        switch (intValue2) {
            case 1:
                str2 = "CALLER";
                break;
            case 2:
                str2 = "UNKNOWN";
                break;
            default:
                str2 = "CALLEE";
                break;
        }
        int A052 = AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A05(this.A00, (A072 + str2.hashCode() + intValue2) * 31));
        Integer num = this.A08;
        int A053 = C18220wO.A05(num, C32492Cb.A00(num), A052);
        int intValue3 = this.A05.intValue();
        switch (intValue3) {
            case 1:
                str3 = "ACCEPTED";
                break;
            case 2:
                str3 = "REJECTED";
                break;
            default:
                str3 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        Integer num2 = this.A04;
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A05(this.A0B, C18220wO.A05(num2, C35606Iyi.A00(num2), (A053 + str3.hashCode() + intValue3) * 31))));
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        StringBuilder A0s = C18190wL.A0s("Call{service=");
        Integer num = this.A07;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "IGDIRECT";
                    break;
                case 2:
                    str = "WHATSAPP";
                    break;
                default:
                    str = "MESSENGER";
                    break;
            }
        } else {
            str = "null";
        }
        A0s.append(str);
        A0s.append(",id=");
        A0s.append(this.A09);
        A0s.append(",remoteId=");
        A0s.append(this.A0A);
        A0s.append(",role=");
        Integer num2 = this.A06;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "CALLER";
                    break;
                case 2:
                    str2 = "UNKNOWN";
                    break;
                default:
                    str2 = "CALLEE";
                    break;
            }
        } else {
            str2 = "null";
        }
        A0s.append(str2);
        A0s.append(",intent=");
        A0s.append(this.A00);
        A0s.append(",threadInfo=");
        A0s.append(this.A03);
        A0s.append(I17.A00(145));
        Integer num3 = this.A08;
        if (num3 != null) {
            str3 = C32492Cb.A00(num3);
        } else {
            str3 = "null";
        }
        A0s.append(str3);
        A0s.append(",incomingCallDecision=");
        Integer num4 = this.A05;
        if (num4 != null) {
            switch (num4.intValue()) {
                case 1:
                    str4 = "ACCEPTED";
                    break;
                case 2:
                    str4 = "REJECTED";
                    break;
                default:
                    str4 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
            }
        } else {
            str4 = "null";
        }
        A0s.append(str4);
        A0s.append(",inCallState=");
        Integer num5 = this.A04;
        if (num5 != null) {
            str5 = C35606Iyi.A00(num5);
        } else {
            str5 = "null";
        }
        A0s.append(str5);
        A0s.append(",participants=");
        A0s.append(this.A0B);
        A0s.append(",endCallRequest=");
        A0s.append(this.A02);
        A0s.append(",disconnectState=");
        A0s.append(this.A01);
        return C18180wK.A0i("}", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A07.intValue());
        parcel.writeString(this.A09);
        String str = this.A0A;
        if (str != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(str);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeInt(this.A06.intValue());
        this.A00.writeToParcel(parcel, i);
        this.A03.writeToParcel(parcel, i);
        parcel.writeInt(this.A08.intValue());
        parcel.writeInt(this.A05.intValue());
        parcel.writeInt(this.A04.intValue());
        parcel.writeList(C18200wM.A0s(this.A0B));
        this.A02.writeToParcel(parcel, i);
        this.A01.writeToParcel(parcel, i);
    }

    public Call(Parcel parcel) {
        String readString;
        this.A07 = C18210wN.A0U(parcel, 3);
        this.A09 = parcel.readString();
        if (parcel.readByte() == 0) {
            readString = null;
        } else {
            readString = parcel.readString();
        }
        this.A0A = readString;
        this.A06 = C18210wN.A0U(parcel, 3);
        this.A00 = new CallIntent(parcel);
        this.A03 = new ThreadInfo(parcel);
        this.A08 = C18210wN.A0U(parcel, 4);
        this.A05 = C18210wN.A0U(parcel, 3);
        this.A04 = C18210wN.A0U(parcel, 10);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        parcel.readList(A0v, getClass().getClassLoader());
        this.A0B = new HashSet(A0v);
        this.A02 = new DisconnectIntent(parcel);
        this.A01 = new DisconnectIntent(parcel);
    }
}
