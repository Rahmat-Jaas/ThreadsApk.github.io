package com.instagram.reels.chat.model;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape16S0000000_I2_16;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ChatStickerStickerType implements Parcelable {
    UNRECOGNIZED("ChatStickerStickerType_unspecified"),
    LEGACY(""),
    JOIN_CHAT_STICKER("join_chat_sticker"),
    MESSAGE_STICKER("message_sticker");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        int A0N = AnonymousClass4WK.A0N(r4);
        if (A0N < 16) {
            A0N = 16;
        }
        LinkedHashMap A0v = C18190wL.A0v(A0N);
        for (ChatStickerStickerType chatStickerStickerType : values()) {
            A0v.put(chatStickerStickerType.A00, chatStickerStickerType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape16S0000000_I2_16(16);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ChatStickerStickerType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
