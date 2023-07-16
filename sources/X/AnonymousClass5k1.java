package X;

import com.facebook.redex.IDxPObserverShape674S0100000_2_I2;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* renamed from: X.5k1  reason: invalid class name */
public final class AnonymousClass5k1 extends C1202479j {
    public final AnonymousClass6S4 A00;
    public final /* synthetic */ AnonymousClass7HL A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5k1(AnonymousClass7HL r1, C104996ci r2, AnonymousClass6S4 r3) {
        super(r2);
        this.A01 = r1;
        this.A00 = r3;
    }

    public final C145388kQ A04(C113806sA r7) {
        AnonymousClass6S4 r3 = this.A00;
        ArrayList A0s = C18200wM.A0s(AnonymousClass7HL.A02(this.A01).values());
        try {
            C126277et r4 = (C126277et) C86104wH.A0p("create", C116326wn.class);
            ImmutableList.Builder A0Q = C86164wN.A0Q();
            for (Object next : A0s) {
                if (next != null) {
                    A0Q.add(next);
                }
            }
            r4.A00.A06("fbids", C18250wR.A0F(A0Q));
            r4.A02 = true;
            C92935kG A002 = AnonymousClass6BW.A00(r7, AnonymousClass7Kz.A0C().A00.A00, r4.build(), C86164wN.A0N(18));
            A002.A6o(new IDxPObserverShape674S0100000_2_I2(r3, 3));
            return A002;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        X.AnonymousClass0LU.A0E("DefaultAuthTicketManager", "Processing result", r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7Kx A05(X.AnonymousClass7EC r13) {
        /*
            r12 = this;
            java.lang.Throwable r0 = r13.A02
            if (r0 != 0) goto L_0x0104
            java.lang.Object r8 = r13.A01
            X.6j4 r8 = (X.C108856j4) r8
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            X.7HL r7 = r12.A01
            java.util.Map r0 = X.AnonymousClass7HL.A02(r7)
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r0)
        L_0x0016:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r1 = r0.getValue()
            java.lang.Object r0 = r0.getKey()
            r4.put(r1, r0)
            goto L_0x0016
        L_0x002c:
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            r8.getClass()
            java.util.List r0 = r8.A02
            java.util.Iterator r11 = r0.iterator()
        L_0x0039:
            boolean r0 = r11.hasNext()
            r2 = 2
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r9 = r11.next()
            com.facebook.graphql.impls.FBPayAuthTicketFragmentImpl r9 = (com.facebook.graphql.impls.FBPayAuthTicketFragmentImpl) r9
            java.lang.String r10 = "strong_id__"
            java.lang.String r0 = r9.getStringValue(r10)
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r9.getStringValue(r10)
            java.lang.Object r5 = r4.remove(r0)
            r5.getClass()
            java.lang.String r5 = (java.lang.String) r5
            X.66M r1 = X.AnonymousClass66M.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "auth_ticket_status"
            java.lang.Enum r0 = X.C86104wH.A0a(r9, r1, r0)
            X.66M r0 = (X.AnonymousClass66M) r0
            r0.getClass()
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "VALID"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00aa
            X.AnonymousClass7HL.A01(r7, r5)     // Catch:{ GeneralSecurityException -> 0x00a2 }
            monitor-enter(r7)     // Catch:{ KeyStoreException -> 0x0099 }
            java.security.PublicKey r0 = X.AnonymousClass7HL.A00(r7, r5)     // Catch:{ all -> 0x0096 }
            r0.getClass()     // Catch:{ all -> 0x0096 }
            byte[] r0 = r0.getEncoded()     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ all -> 0x0096 }
            monitor-exit(r7)     // Catch:{ KeyStoreException -> 0x0099 }
            long r0 = r8.A00     // Catch:{ KeyStoreException -> 0x0099 }
            X.7Dk r0 = X.C120967Dk.A00(r9, r5, r2, r0)     // Catch:{ KeyStoreException -> 0x0099 }
            r6.add(r0)     // Catch:{ KeyStoreException -> 0x0099 }
            goto L_0x0039
        L_0x0096:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ KeyStoreException -> 0x0099 }
            throw r0     // Catch:{ KeyStoreException -> 0x0099 }
        L_0x0099:
            r2 = move-exception
            java.lang.String r1 = "DefaultAuthTicketManager"
            java.lang.String r0 = "Processing result"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            goto L_0x0039
        L_0x00a2:
            r2 = move-exception
            java.lang.String r1 = "DefaultAuthTicketManager"
            java.lang.String r0 = "Get Signature safe"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
        L_0x00aa:
            java.lang.Throwable r3 = r7.A06(r5)
            if (r3 == 0) goto L_0x0039
            java.lang.Class<X.7HL> r2 = X.AnonymousClass7HL.class
            java.lang.String r0 = r9.getStringValue(r10)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r5}
            java.lang.String r0 = "When Deleting AT Server ID %s local alias"
            X.AnonymousClass0LU.A05(r2, r0, r3, r1)
            goto L_0x0039
        L_0x00c1:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00f8
            java.util.Iterator r5 = X.C18190wL.A0u(r4)
        L_0x00cb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.util.Map$Entry r4 = X.C18180wK.A0o(r5)
            java.lang.Object r0 = r4.getValue()
            r0.getClass()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Throwable r3 = r7.A06(r0)
            if (r3 == 0) goto L_0x00cb
            java.lang.Class<X.7HL> r2 = X.AnonymousClass7HL.class
            java.lang.Object r1 = r4.getKey()
            java.lang.Object r0 = r4.getValue()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "When Deleting AT* Server ID %s local alias"
            X.AnonymousClass0LU.A05(r2, r0, r3, r1)
            goto L_0x00cb
        L_0x00f8:
            java.lang.String r1 = r8.A01
            X.79P r0 = new X.79P
            r0.<init>(r1, r6)
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)
            return r0
        L_0x0104:
            X.7Kx r0 = X.AnonymousClass7Kx.A0C(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5k1.A05(X.7EC):X.7Kx");
    }
}
