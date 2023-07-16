package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.0f7  reason: invalid class name and case insensitive filesystem */
public final class C09250f7 {
    public static C09250f7 A04;
    public static final C09260f8 A05 = new C09260f8();
    public final Context A00;
    public final Resources A01;
    public final Map A02;
    public final Map A03;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r4 == 18) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface A03(X.C09340fG r7) {
        /*
            r6 = this;
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            java.util.Map r3 = r6.A03
            java.lang.Object r0 = r3.get(r7)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 != 0) goto L_0x002e
            java.lang.String r5 = r7.A03
            if (r5 == 0) goto L_0x002f
            int r4 = r7.ordinal()
            r2 = 2
            r1 = 22
            r0 = 20
            if (r4 == r0) goto L_0x0025
            if (r4 == r1) goto L_0x0024
            r0 = 18
            r2 = 0
            if (r4 != r0) goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r5, r2)
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r3.put(r7, r0)
        L_0x002e:
            return r0
        L_0x002f:
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x0038
            android.graphics.Typeface r0 = r6.A00(r7)
            goto L_0x0029
        L_0x0038:
            X.JdX r0 = r7.A00()
            if (r0 == 0) goto L_0x0043
            android.graphics.Typeface r0 = r6.A01(r7)
            goto L_0x0029
        L_0x0043:
            java.lang.String r1 = r7.A02
            if (r1 == 0) goto L_0x006a
            java.lang.String r0 = "InstagramSansCondensedRegular.otf"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0057
            A02(r7)
            android.graphics.Typeface r0 = r6.A01(r7)
            goto L_0x0029
        L_0x0057:
            java.lang.String r2 = "Requested font, "
            java.lang.String r1 = r7.name()
            java.lang.String r0 = ", is not supported as global font."
            java.lang.String r1 = X.AnonymousClass00U.A0V(r2, r1, r0)
            java.lang.String r0 = "TypefaceRepository"
            X.AnonymousClass0LU.A0B(r0, r1)
            r0 = 0
            goto L_0x0029
        L_0x006a:
            java.lang.String r2 = "The requested font, "
            java.lang.String r1 = r7.name()
            java.lang.String r0 = ", does not have a backing source. You need to provide either a systemFontName, assetFontName, or a fileDescriptor."
            java.lang.String r1 = X.AnonymousClass00U.A0V(r2, r1, r0)
            java.lang.String r0 = "TypefaceRepository"
            X.AnonymousClass0LU.A0B(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09250f7.A03(X.0fG):android.graphics.Typeface");
    }

    private final Typeface A00(C09340fG r6) {
        Typeface createFromAsset = Typeface.createFromAsset(this.A01.getAssets(), r6.A01);
        if (createFromAsset != null) {
            if (createFromAsset.equals(Typeface.DEFAULT)) {
                C10450iM.A03("TypefaceRepository", AnonymousClass00U.A0V("Requested font, ", r6.name(), ", is not supported by this device."));
            }
            C62493a7.A00(r6.name());
            return createFromAsset;
        }
        C10450iM.A03("TypefaceRepository", AnonymousClass00U.A0V("Requested font, ", r6.name(), ", is a asset typeface and is not available."));
        return null;
    }

    private final Typeface A01(C09340fG r6) {
        File file;
        Map map = this.A02;
        boolean z = true;
        Typeface typeface = null;
        if (map.get(r6) == null && AnonymousClass8AP.A0E(r6, C09340fG.values())) {
            A04((UserSession) null);
        }
        C38089KKq kKq = (C38089KKq) map.get(r6);
        if (kKq == null || (file = (File) kKq.A00()) == null) {
            AnonymousClass0LU.A0B("TypefaceRepository", AnonymousClass00U.A0V("Requested font, ", r6.name(), ", is a remote typeface and is not available."));
            return null;
        }
        try {
            typeface = Typeface.createFromFile(file);
        } catch (RuntimeException e) {
            map.remove(r6);
            AnonymousClass0LU.A0B("TypefaceRepository", e.getMessage());
        }
        String name = r6.name();
        if (typeface == null) {
            z = false;
        }
        C62493a7.A02(name, z);
        return typeface;
    }

    public C09250f7(Context context) {
        this.A00 = context;
        this.A01 = context.getResources();
        Class<C09340fG> cls = C09340fG.class;
        Map synchronizedMap = Collections.synchronizedMap(new EnumMap(cls));
        C04220Ms.A06(synchronizedMap);
        this.A03 = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new EnumMap(cls));
        C04220Ms.A06(synchronizedMap2);
        this.A02 = synchronizedMap2;
    }

    public static final void A02(C09340fG r3) {
        C36723JdX jdX;
        String language = Locale.getDefault().getLanguage();
        if (C04220Ms.A0I(language, new Locale("ar").getLanguage())) {
            jdX = C09240f6.A09;
        } else if (C04220Ms.A0I(language, new Locale("iw").getLanguage())) {
            jdX = C09240f6.A0D;
        } else if (C04220Ms.A0I(language, new Locale("th").getLanguage())) {
            jdX = C09240f6.A0G;
        } else if (C04220Ms.A0I(language, new Locale("el").getLanguage())) {
            jdX = C09240f6.A0C;
        } else if (C04220Ms.A0I(language, new Locale("ru").getLanguage()) || C04220Ms.A0I(language, new Locale("uk").getLanguage()) || C04220Ms.A0I(language, new Locale("sr").getLanguage()) || C04220Ms.A0I(language, new Locale("bg").getLanguage())) {
            jdX = C09240f6.A0A;
        } else if (C04220Ms.A0I(language, new Locale("hi").getLanguage())) {
            jdX = C09240f6.A0B;
        } else {
            jdX = C09240f6.A0F;
        }
        r3.A01(jdX);
    }

    public final void A04(UserSession userSession) {
        C36723JdX A002;
        for (C09340fG r4 : C09340fG.values()) {
            if ((!r4.A04 || userSession == null || C09330fF.A00(userSession).booleanValue()) && (A002 = r4.A00()) != null) {
                C38089KKq kKq = new C38089KKq(new IGy(this.A00, A002, C39836L2m.A00));
                kKq.A00();
                this.A02.put(r4, kKq);
            }
        }
    }
}
