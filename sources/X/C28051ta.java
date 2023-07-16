package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15;

/* renamed from: X.1ta  reason: invalid class name and case insensitive filesystem */
public final class C28051ta extends AnonymousClass5NL implements C21360Bt5 {
    public final C154439Bx D5L(C112176p7 r29) {
        AnonymousClass19O r8;
        AnonymousClass18V r7;
        ArrayList arrayList;
        String stringValueByHashCode = getStringValueByHashCode(225490031);
        if (stringValueByHashCode != null) {
            String stringValueByHashCode2 = getStringValueByHashCode(-168253766);
            String stringValueByHashCode3 = getStringValueByHashCode(552573414);
            C82684q6 r1 = (C82684q6) getTreeValueByHashCode(-1183438890, C28041tZ.class);
            if (r1 != null) {
                r8 = r1.D5D();
            } else {
                r8 = null;
            }
            Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1601672934);
            Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1011195986);
            String stringValueByHashCode4 = getStringValueByHashCode(3226745);
            Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(91445688);
            ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(2040312680);
            Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-9393932);
            List A0D = A0D(new KtLambdaShape160S0100000_I2_15(this, 25), 2140775389);
            ImmutableList optionalStringListByHashCode2 = getOptionalStringListByHashCode(-3896982);
            C82084p3 r12 = (C82084p3) getTreeValueByHashCode(700235949, C27771t8.class);
            C112176p7 r5 = r29;
            if (r12 != null) {
                r7 = r12.Cze(r5);
            } else {
                r7 = null;
            }
            Float A07 = A07(109264530);
            String stringValueByHashCode5 = getStringValueByHashCode(-823445795);
            if (stringValueByHashCode5 != null) {
                Class<ImmutablePandoUserDict> cls = ImmutablePandoUserDict.class;
                ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(378965114, cls);
                if (optionalTreeListByHashCode != null) {
                    ArrayList A0x = AnonymousClass0wJ.A0x(optionalTreeListByHashCode, 10);
                    Iterator it = optionalTreeListByHashCode.iterator();
                    while (it.hasNext()) {
                        C18180wK.A1U(A0x, it);
                    }
                    arrayList = AnonymousClass0wJ.A0x(A0x, 10);
                    Iterator it2 = A0x.iterator();
                    while (it2.hasNext()) {
                        C18190wL.A1Q(r5, arrayList, it2);
                    }
                } else {
                    arrayList = null;
                }
                ImmutableList optionalStringListByHashCode3 = getOptionalStringListByHashCode(760022103);
                ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) getTreeValueByHashCode(3599307, cls);
                if (immutablePandoUserDict != null) {
                    return new C154439Bx(r7, r8, (User) r5.A00(new User(immutablePandoUserDict)), optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, A07, A07(111972721), optionalIntValueByHashCode, stringValueByHashCode, stringValueByHashCode2, stringValueByHashCode3, stringValueByHashCode4, stringValueByHashCode5, getStringValueByHashCode(3601339), (HashMap) null, optionalStringListByHashCode, A0D, optionalStringListByHashCode2, arrayList, optionalStringListByHashCode3);
                }
                throw AnonymousClass0wJ.A0b();
            }
            throw AnonymousClass0wJ.A0b();
        }
        throw AnonymousClass0wJ.A0b();
    }
}
