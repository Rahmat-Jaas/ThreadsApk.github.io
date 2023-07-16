package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0TJ;
import X.AnonymousClass0ZU;
import X.AnonymousClass0gN;
import X.AnonymousClass2NY;
import X.AnonymousClass39M;
import X.AnonymousClass3BA;
import X.AnonymousClass3S4;
import X.AnonymousClass3S5;
import X.AnonymousClass3S6;
import X.AnonymousClass3SL;
import X.AnonymousClass3V2;
import X.AnonymousClass3XU;
import X.AnonymousClass3YL;
import X.AnonymousClass44U;
import X.AnonymousClass491;
import X.AnonymousClass49O;
import X.AnonymousClass49S;
import X.AnonymousClass49T;
import X.AnonymousClass49X;
import X.AnonymousClass7M8;
import X.C05030Qo;
import X.C09820gj;
import X.C10300i6;
import X.C10600ic;
import X.C110496lm;
import X.C11660kZ;
import X.C11900kz;
import X.C12090lI;
import X.C130957rB;
import X.C132137tO;
import X.C18250wR;
import X.C32252Az;
import X.C548830t;
import X.C558634w;
import X.C561035u;
import X.C58433Fp;
import X.C60883Qx;
import X.C61063Rt;
import X.C61623Up;
import X.C61793Vp;
import X.C62143Xh;
import X.C62353Yv;
import X.C62813an;
import X.C63473hX;
import X.C63803iN;
import X.C63813iO;
import X.C64543mW;
import X.C67223zB;
import X.C67453za;
import X.C685044b;
import X.C691747c;
import X.C692447n;
import X.C696349j;
import X.C697449w;
import X.H8D;
import android.content.Context;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Function;

public class IDxObjectShape236S0100000_1_I2 implements Function, AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    public IDxObjectShape236S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object invoke() {
        AnonymousClass39M r1;
        switch (this.A01) {
            case 0:
                return new AnonymousClass49X((C10300i6) this.A00);
            case 1:
                return new C62813an((C10300i6) this.A00);
            case 2:
                return new C62353Yv((C10300i6) this.A00);
            case 3:
                C10300i6 r0 = (C10300i6) this.A00;
                C11660kZ A002 = C12090lI.A00(r0);
                AnonymousClass3BA r2 = new AnonymousClass3BA();
                C62143Xh r12 = C64543mW.A04;
                String A04 = C05030Qo.A04(r0);
                if (A04 == null) {
                    A04 = "0";
                }
                return new C64543mW(r2, r12, A002, A04);
            case 4:
                C10300i6 r6 = (C10300i6) this.A00;
                AnonymousClass0TJ r5 = AnonymousClass0TJ.A05;
                return new C58433Fp(C63803iN.A07(r5, r6, 36593134246888278L).intValue(), C63803iN.A07(r5, r6, 36593134246953815L).intValue(), C63803iN.A0E(r5, r6, 36311659270111916L), C63803iN.A0E(r5, r6, 36318136080797849L));
            case 5:
                C63813iO.A0D(((Fragment) this.A00).getActivity(), "On appear triggered!", 0);
                return null;
            case 6:
                return new C691747c((UserSession) this.A00);
            case 7:
                return new AnonymousClass3S4((C10300i6) this.A00);
            case 8:
                return new C67223zB((C10300i6) this.A00);
            case 9:
                return new AnonymousClass3S5((UserSession) this.A00);
            case 10:
                return new AnonymousClass3S6((UserSession) this.A00);
            case 11:
                return new C697449w((C10300i6) this.A00);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new C61063Rt((UserSession) this.A00);
            case 13:
                return new C63473hX((UserSession) this.A00, C548830t.A00);
            case 14:
                return new C61623Up((UserSession) this.A00);
            case 15:
                return new AnonymousClass49O((UserSession) this.A00);
            case 16:
                List list = C60883Qx.A00;
                AnonymousClass2NY r52 = new AnonymousClass2NY();
                Context context = C10600ic.A00;
                new C11900kz(C09820gj.A00, AnonymousClass0gN.A00(), C32252Az.class.toString());
                new H8D(context, r52, (UserSession) this.A00, list);
                throw C18250wR.A0V(AnonymousClass000.A00(0));
            case LangUtils.HASH_SEED /*17*/:
                return new AnonymousClass3XU((C10300i6) this.A00);
            case 18:
                C10300i6 r3 = (C10300i6) this.A00;
                AnonymousClass0TJ r22 = AnonymousClass0TJ.A05;
                boolean A0E = C63803iN.A0E(r22, r3, 36312312107369390L);
                boolean A0E2 = C63803iN.A0E(r22, r3, 2342155321321128879L);
                return new C130957rB(new C110496lm(C63803iN.A0C(r22, r3, 36875262060920900L), C63803iN.A00(r22, r3, 37156737037041690L), C63803iN.A06(r22, r3, 37156737036648473L).intValue(), A0E, A0E2));
            case 19:
                C10300i6 r32 = (C10300i6) this.A00;
                AnonymousClass0TJ r23 = AnonymousClass0TJ.A05;
                boolean A0E3 = C63803iN.A0E(r23, r32, 36312312106648493L);
                boolean A0E4 = C63803iN.A0E(r23, r32, 2342155321321128879L);
                return new C132137tO(new C110496lm(C63803iN.A0C(r23, r32, 36875262060920900L), C63803iN.A00(r23, r32, 37156737037369372L), C63803iN.A06(r23, r32, 37156737037172763L).intValue(), A0E3, A0E4));
            case 20:
                return new AnonymousClass49S((UserSession) this.A00);
            case 21:
                return new C67453za((C10300i6) this.A00);
            case 22:
                return new C558634w((UserSession) this.A00);
            case 23:
                return new AnonymousClass3V2((UserSession) this.A00);
            case 24:
                return new C692447n((UserSession) this.A00);
            case 25:
                return new AnonymousClass44U((UserSession) this.A00);
            case Rfc3492Idn.tmax /*26*/:
                return new AnonymousClass49T((UserSession) this.A00);
            case 27:
                return new C561035u((UserSession) this.A00);
            case 28:
                C10300i6 r4 = (C10300i6) this.A00;
                AnonymousClass7M8 A003 = AnonymousClass3SL.A00(C10600ic.A00, "AuthHeaderPrefs");
                synchronized (AnonymousClass39M.class) {
                    r1 = AnonymousClass39M.A02;
                    if (r1 == null) {
                        r1 = new AnonymousClass39M(C10600ic.A00);
                        AnonymousClass39M.A02 = r1;
                    }
                }
                return new C61793Vp(A003, r4, r1);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new C685044b(AnonymousClass3SL.A00(C10600ic.A00, "WwwClaimHeaderPrefs"), (C10300i6) this.A00);
            case 30:
                return new AnonymousClass3YL((UserSession) this.A00);
            case 31:
                return new AnonymousClass491((UserSession) this.A00);
            default:
                return new C696349j((UserSession) this.A00);
        }
    }
}
