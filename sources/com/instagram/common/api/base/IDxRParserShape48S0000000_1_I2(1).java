package com.instagram.common.api.base;

import X.AnonymousClass0wJ;
import X.AnonymousClass1j3;
import X.AnonymousClass2K5;
import X.AnonymousClass3Za;
import X.C04220Ms;
import X.C132567u8;
import X.C146578mT;
import X.C18180wK;
import X.MMo;

public class IDxRParserShape48S0000000_1_I2 extends C132567u8 {
    public final int A00;

    public IDxRParserShape48S0000000_1_I2(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ C146578mT A00(MMo mMo) {
        switch (this.A00) {
            case 0:
                return AnonymousClass2K5.parseFromJson(mMo);
            case 1:
                if (mMo == null) {
                    throw AnonymousClass0wJ.A0b();
                }
                break;
            case 2:
                if (mMo == null) {
                    throw C18180wK.A0a("SSIMCalcTask Json parser canont be null");
                }
                break;
        }
        AnonymousClass1j3 parseFromJson = AnonymousClass3Za.parseFromJson(mMo);
        C04220Ms.A06(parseFromJson);
        return parseFromJson;
    }
}
