package com.instagram.realtimeclient;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C18987Aon;
import X.C25563Dnz;
import X.C27627Eqe;
import X.C40318LcR;
import X.C86104wH;
import X.MMo;
import X.MMp;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

public final class SkywalkerCommand__JsonHelper {
    public static SkywalkerCommand parseFromJson(MMo mMo) {
        return (SkywalkerCommand) C25563Dnz.A02(mMo, new C27627Eqe() {
            public SkywalkerCommand invoke(MMo mMo) {
                return SkywalkerCommand__JsonHelper.unsafeParseFromJson(mMo);
            }
        });
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean processSingleField(com.instagram.realtimeclient.SkywalkerCommand r4, java.lang.String r5, X.MMo r6) {
        /*
            java.lang.String r0 = "sub"
            boolean r0 = r0.equals(r5)
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0025
            X.LcR r1 = r6.A0f()
            X.LcR r0 = X.C40318LcR.START_ARRAY
            if (r1 != r0) goto L_0x0022
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
        L_0x0016:
            X.LcR r1 = r6.A0g()
            X.LcR r0 = X.C40318LcR.END_ARRAY
            if (r1 == r0) goto L_0x0022
            X.AnonymousClass0wJ.A1F(r6, r2)
            goto L_0x0016
        L_0x0022:
            r4.mSubscribeTopics = r2
            return r3
        L_0x0025:
            java.lang.String r0 = "unsub"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0048
            X.LcR r1 = r6.A0f()
            X.LcR r0 = X.C40318LcR.START_ARRAY
            if (r1 != r0) goto L_0x0045
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
        L_0x0039:
            X.LcR r1 = r6.A0g()
            X.LcR r0 = X.C40318LcR.END_ARRAY
            if (r1 == r0) goto L_0x0045
            X.AnonymousClass0wJ.A1F(r6, r2)
            goto L_0x0039
        L_0x0045:
            r4.mUnsubscribeTopics = r2
            return r3
        L_0x0048:
            java.lang.String r0 = "pub"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x006b
            X.LcR r1 = r6.A0f()
            X.LcR r0 = X.C40318LcR.START_OBJECT
            if (r1 != r0) goto L_0x0068
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
        L_0x005c:
            X.LcR r1 = r6.A0g()
            X.LcR r0 = X.C40318LcR.END_OBJECT
            if (r1 == r0) goto L_0x0068
            X.AnonymousClass0wJ.A1G(r6, r2)
            goto L_0x005c
        L_0x0068:
            r4.mPublishTopicToPayload = r2
            return r3
        L_0x006b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.SkywalkerCommand__JsonHelper.processSingleField(com.instagram.realtimeclient.SkywalkerCommand, java.lang.String, X.MMo):boolean");
    }

    public static void serializeToJson(MMp mMp, SkywalkerCommand skywalkerCommand, boolean z) {
        if (z) {
            mMp.A0J();
        }
        if (skywalkerCommand.mSubscribeTopics != null) {
            mMp.A0U("sub");
            mMp.A0I();
            Iterator it = skywalkerCommand.mSubscribeTopics.iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                if (A0k != null) {
                    mMp.A0Y(A0k);
                }
            }
            mMp.A0F();
        }
        if (skywalkerCommand.mUnsubscribeTopics != null) {
            mMp.A0U("unsub");
            mMp.A0I();
            Iterator it2 = skywalkerCommand.mUnsubscribeTopics.iterator();
            while (it2.hasNext()) {
                String A0k2 = C18180wK.A0k(it2);
                if (A0k2 != null) {
                    mMp.A0Y(A0k2);
                }
            }
            mMp.A0F();
        }
        if (skywalkerCommand.mPublishTopicToPayload != null) {
            mMp.A0U("pub");
            mMp.A0J();
            Iterator A0u = C18190wL.A0u(skywalkerCommand.mPublishTopicToPayload);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                if (C86104wH.A0c(mMp, A0o) == null) {
                    mMp.A0H();
                } else {
                    mMp.A0Y(C18230wP.A0u(A0o));
                }
            }
            mMp.A0G();
        }
        if (z) {
            mMp.A0G();
        }
    }

    public static SkywalkerCommand unsafeParseFromJson(MMo mMo) {
        SkywalkerCommand skywalkerCommand = new SkywalkerCommand();
        if (mMo.A0f() != C40318LcR.START_OBJECT) {
            mMo.A0x();
            return null;
        }
        while (mMo.A0g() != C40318LcR.END_OBJECT) {
            processSingleField(skywalkerCommand, AnonymousClass0wJ.A0q(mMo), mMo);
            mMo.A0x();
        }
        return skywalkerCommand;
    }

    public static SkywalkerCommand parseFromJson(String str) {
        return parseFromJson(C18180wK.A0L(str));
    }

    public static String serializeToJson(SkywalkerCommand skywalkerCommand) {
        StringWriter A0d = C18230wP.A0d();
        MMp A04 = C18987Aon.A00.A04(A0d);
        serializeToJson(A04, skywalkerCommand, true);
        A04.close();
        return A0d.toString();
    }
}
