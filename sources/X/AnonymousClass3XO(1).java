package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3XO  reason: invalid class name */
public final class AnonymousClass3XO {
    public static final C62023Wu A00 = new AnonymousClass16Z();
    public static final List A01 = Arrays.asList(new Integer[]{20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101});
    public static final List A02;
    public static final Map A03;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r2 < 20140701) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A00(android.content.Intent r6, android.os.Bundle r7, X.AnonymousClass32F r8) {
        /*
            r5 = 0
            if (r6 == 0) goto L_0x0042
            java.lang.String r1 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            r0 = 0
            int r2 = r6.getIntExtra(r1, r0)
            java.util.List r1 = A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x001c
            r1 = 20140701(0x133529d, float:3.293638E-38)
            r0 = 1
            if (r2 >= r1) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "com.facebook.platform.protocol.BRIDGE_ARGS"
            android.os.Bundle r1 = r6.getBundleExtra(r0)
            if (r1 == 0) goto L_0x0030
            java.lang.String r0 = "action_id"
            java.lang.String r0 = r1.getString(r0)
        L_0x002d:
            if (r0 == 0) goto L_0x0042
            goto L_0x0039
        L_0x0030:
            r0 = r5
            goto L_0x002d
        L_0x0032:
            java.lang.String r0 = "com.facebook.platform.protocol.CALL_ID"
            java.lang.String r0 = r6.getStringExtra(r0)
            goto L_0x002d
        L_0x0039:
            java.util.UUID r5 = java.util.UUID.fromString(r0)     // Catch:{ IllegalArgumentException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            r0.toString()
        L_0x0042:
            if (r5 != 0) goto L_0x0046
            r3 = 0
        L_0x0045:
            return r3
        L_0x0046:
            android.content.Intent r3 = X.C18230wP.A0B()
            java.lang.String r1 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            r0 = 0
            int r0 = r6.getIntExtra(r1, r0)
            r3.putExtra(r1, r0)
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "action_id"
            r4.putString(r0, r1)
            if (r8 == 0) goto L_0x0082
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "error_description"
            r2.putString(r0, r1)
            java.lang.Integer r1 = r8.A00
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x007d
            java.lang.String r1 = "error_type"
            java.lang.String r0 = "UserCanceled"
            r2.putString(r1, r0)
        L_0x007d:
            java.lang.String r0 = "error"
            r4.putBundle(r0, r2)
        L_0x0082:
            java.lang.String r0 = "com.facebook.platform.protocol.BRIDGE_ARGS"
            r3.putExtra(r0, r4)
            if (r7 == 0) goto L_0x0045
            java.lang.String r0 = "com.facebook.platform.protocol.RESULT_ARGS"
            r3.putExtra(r0, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XO.A00(android.content.Intent, android.os.Bundle, X.32F):android.content.Intent");
    }

    static {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(A00);
        A0v.add(new C207816b());
        A02 = A0v;
        HashMap A0y = AnonymousClass0wJ.A0y();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        A0v2.add(new C207716a());
        List list = A02;
        A0y.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
        A0y.put("com.facebook.platform.action.request.FEED_DIALOG", list);
        A0y.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
        A0y.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
        A0y.put("com.facebook.platform.action.request.MESSAGE_DIALOG", A0v2);
        A0y.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", A0v2);
        A03 = A0y;
    }
}
