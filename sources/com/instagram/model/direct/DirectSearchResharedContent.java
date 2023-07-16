package com.instagram.model.direct;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass2OS;
import X.BKU;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C19527Axo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class DirectSearchResharedContent implements DirectSearchResult {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(56);
    public BKU A00;
    public UserSession A01;
    public Set A02;

    public final int describeContents() {
        return 0;
    }

    public final String AB0() {
        return StringFormatUtil.formatStrLocaleSafe("| %-30s |", (Object) "DirectSearchResharedContent");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01.token);
        BKU bku = this.A00;
        int i2 = 1;
        if (bku == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (bku != null) {
            byte[] A1b = BKU.A1b(bku);
            parcel.writeInt(A1b.length);
            parcel.writeByteArray(A1b);
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            try {
                A0v.add(C19527Axo.A04(C18220wO.A0c(it)));
            } catch (IOException e) {
                AnonymousClass0LU.A0E("DirectSearchResharedContent", "Couldn't serialize user to string", e);
            }
        }
        parcel.writeList(ImmutableList.copyOf((Collection) A0v));
    }

    public DirectSearchResharedContent(Parcel parcel) {
        String readString = parcel.readString();
        Bundle A06 = C18180wK.A06();
        C18190wL.A13(A06, readString);
        this.A01 = C18180wK.A0V(A06);
        if (parcel.readInt() == 1) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            try {
                this.A00 = AnonymousClass2OS.A00(this.A01, bArr);
            } catch (IOException e) {
                AnonymousClass0LU.A0E("DirectSearchResharedContent", "Media was not deserializable.", e);
            }
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        parcel.readList(A0v, (ClassLoader) null);
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        Iterator it = A0v.iterator();
        while (it.hasNext()) {
            try {
                A0v2.add(C19527Axo.A02(C18180wK.A0k(it)));
            } catch (IOException e2) {
                AnonymousClass0LU.A0E("DirectSearchResharedContent", "Couldn't deserialize string to user", e2);
            }
        }
        this.A02 = ImmutableSet.A02(A0v2);
    }

    public DirectSearchResharedContent(BKU bku, UserSession userSession, Set set) {
        this.A01 = userSession;
        this.A00 = bku;
        this.A02 = set;
    }
}
