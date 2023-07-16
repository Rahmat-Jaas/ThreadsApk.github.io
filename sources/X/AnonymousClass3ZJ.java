package X;

import android.os.BaseBundle;
import com.instagram.service.session.UserSession;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.3ZJ  reason: invalid class name */
public abstract class AnonymousClass3ZJ {
    public static AnonymousClass3ZJ A00;

    public static synchronized AnonymousClass3ZJ A01() {
        AnonymousClass3ZJ r0;
        synchronized (AnonymousClass3ZJ.class) {
            r0 = A00;
        }
        return r0;
    }

    public static void A02(BaseBundle baseBundle, UserSession userSession, Integer num) {
        baseBundle.getString("DynamicFlowPlugin.extraFlowId").getClass();
        C60093Nq.A01(userSession, num, A01().A04(baseBundle.getString("DynamicFlowPlugin.extraFlowId")));
    }

    public final Object A03() {
        if (this instanceof C29591yt) {
            return A01().A03();
        }
        AnonymousClass3HU r1 = (AnonymousClass3HU) ((C29601yu) this).A01.get("RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f");
        AnonymousClass7Ko.A07(r1, "Could not find flow for the given id.");
        return r1.A02;
    }

    public final String A04(String str) {
        if (this instanceof C29591yt) {
            return A01().A04(str);
        }
        AnonymousClass3HU r1 = (AnonymousClass3HU) ((C29601yu) this).A01.get(str);
        AnonymousClass7Ko.A07(r1, "Could not find flow for the given id.");
        AnonymousClass3DI r0 = r1.A01;
        if (r0 != null) {
            return r0.A08;
        }
        throw C18180wK.A0a("Step has not been launched.");
    }

    public final Set A05() {
        if (this instanceof C29591yt) {
            return A01().A05();
        }
        return ((C29601yu) this).A01.keySet();
    }

    public final void A06() {
        if (this instanceof C29591yt) {
            A01().A06();
            return;
        }
        C29601yu r0 = (C29601yu) this;
        Map map = r0.A01;
        map.get("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
        Map map2 = r0.A00;
        C83904sB r02 = (C83904sB) map2.get("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
        if (r02 != null) {
            r02.BzX();
        }
        map.remove("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
        map2.remove("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r5 = (com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.AnonymousClass3HU r9, X.C83904sB r10, java.lang.Object r11, java.lang.String r12) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C29591yt
            if (r0 == 0) goto L_0x000c
            X.3ZJ r0 = A01()
            r0.A07(r9, r10, r11, r12)
        L_0x000b:
            return
        L_0x000c:
            r0 = r8
            X.1yu r0 = (X.C29601yu) r0
            java.util.Map r7 = r0.A01
            r7.put(r12, r9)
            java.util.Map r6 = r0.A00
            r6.put(r12, r10)
            X.3DI r0 = r9.A01
            if (r0 != 0) goto L_0x0054
            X.2tI r5 = r9.A00(r11)
        L_0x0021:
            boolean r4 = r5 instanceof com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2
            if (r4 == 0) goto L_0x000b
            com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2 r5 = (com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2) r5
            int r3 = r5.A03
            if (r3 != 0) goto L_0x000b
            java.lang.Object r0 = r5.A01
            boolean r0 = X.C18220wO.A1U(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r6.get(r12)
            X.4sB r1 = (X.C83904sB) r1
            if (r1 == 0) goto L_0x0048
            if (r4 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004f
            java.lang.Object r0 = r5.A01
        L_0x0043:
            X.3DI r0 = (X.AnonymousClass3DI) r0
        L_0x0045:
            r1.BzL(r0, r2)
        L_0x0048:
            r7.remove(r12)
            r6.remove(r12)
            return
        L_0x004f:
            java.lang.Object r0 = r5.A02
            goto L_0x0043
        L_0x0052:
            r0 = 0
            goto L_0x0045
        L_0x0054:
            r0 = 0
            com.instagram.util.dynamicflow.impl.IDxSAdapterShape198S0100000_1_I2 r5 = new com.instagram.util.dynamicflow.impl.IDxSAdapterShape198S0100000_1_I2
            r5.<init>(r9, r0)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZJ.A07(X.3HU, X.4sB, java.lang.Object, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r5 = (com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.lang.String r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C29591yt
            if (r0 == 0) goto L_0x000c
            X.3ZJ r0 = A01()
            r0.A08(r8, r9)
        L_0x000b:
            return
        L_0x000c:
            r2 = r7
            X.1yu r2 = (X.C29601yu) r2
            java.util.Map r6 = r2.A01
            java.lang.Object r1 = r6.get(r8)
            X.3HU r1 = (X.AnonymousClass3HU) r1
            java.lang.String r0 = "Could not find flow for the given id."
            X.AnonymousClass7Ko.A07(r1, r0)
            X.2tI r5 = r1.A00(r9)
            boolean r4 = r5 instanceof com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2
            if (r4 == 0) goto L_0x000b
            com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2 r5 = (com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2) r5
            int r3 = r5.A03
            if (r3 != 0) goto L_0x000b
            java.lang.Object r0 = r5.A01
            boolean r0 = X.C18220wO.A1U(r0)
            if (r0 == 0) goto L_0x000b
            java.util.Map r2 = r2.A00
            java.lang.Object r1 = r2.get(r8)
            X.4sB r1 = (X.C83904sB) r1
            if (r1 == 0) goto L_0x0047
            if (r4 == 0) goto L_0x0051
            if (r3 == 0) goto L_0x004e
            java.lang.Object r0 = r5.A01
        L_0x0042:
            X.3DI r0 = (X.AnonymousClass3DI) r0
        L_0x0044:
            r1.BzL(r0, r9)
        L_0x0047:
            r6.remove(r8)
            r2.remove(r8)
            return
        L_0x004e:
            java.lang.Object r0 = r5.A02
            goto L_0x0042
        L_0x0051:
            r0 = 0
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZJ.A08(java.lang.String, java.lang.Object):void");
    }

    public final String[] A09() {
        if (this instanceof C29591yt) {
            return A01().A09();
        }
        AnonymousClass3HU r4 = (AnonymousClass3HU) ((C29601yu) this).A01.get("RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f");
        AnonymousClass7Ko.A07(r4, "Could not find flow for the given id.");
        Stack stack = r4.A04;
        String[] strArr = new String[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            strArr[i] = ((AnonymousClass3DI) r4.A03.get(AnonymousClass0wJ.A04(stack.get(i)))).A08;
        }
        return strArr;
    }
}
