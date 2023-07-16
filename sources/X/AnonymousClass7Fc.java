package X;

import android.content.Context;
import android.util.Base64;
import com.facebook.graphql.impls.AvailableCardTypesImpl;
import com.facebook.graphql.impls.NewCreditCardOptionImpl;
import com.facebook.graphql.impls.PaymentMethodComponentImpl;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;

/* renamed from: X.7Fc  reason: invalid class name */
public final class AnonymousClass7Fc {
    public static final void A02(Context context, C883057n r7, AnonymousClass587 r8) {
        String str;
        KeyPair keyPair;
        Cipher cipher;
        if (r8.A07() && (str = (String) r8.A07.A00("OTC_CREDIT_CARD_NUMBER")) != null && str.length() != 0) {
            AnonymousClass7GZ.A01(context);
            if (AnonymousClass7GZ.A01 == null || (keyPair = AnonymousClass7GZ.A00) == null || (cipher = AnonymousClass7GZ.A02) == null) {
                AnonymousClass0LU.A0B("CryptographyUtil", "isCryptographyInitialized is false");
            } else {
                cipher.init(2, keyPair.getPrivate());
                byte[] decode = Base64.decode(str, 0);
                Cipher cipher2 = AnonymousClass7GZ.A02;
                if (cipher2 == null) {
                    C04220Ms.A0E("cipher");
                    throw null;
                }
                byte[] doFinal = cipher2.doFinal(decode);
                C04220Ms.A06(doFinal);
                str = new String(doFinal, AnonymousClass74V.A05);
            }
            AnonymousClass7Ih A01 = r7.A01(13);
            if (A01 instanceof C92035hU) {
                AnonymousClass7Ih A0L = ((C92055hW) A01).A0L(13);
                if (A0L instanceof C92105hd) {
                    ((C92005hR) A0L).A0O(str);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r6.length() == 0) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.content.Context r8, X.C883057n r9, X.AnonymousClass587 r10) {
        /*
            r7 = 1
            boolean r0 = r10.A07()
            if (r0 == 0) goto L_0x0044
            r1 = 13
            X.7Ih r0 = r9.A01(r1)
            if (r0 == 0) goto L_0x0044
            android.util.SparseArray r0 = r0.A0E()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r6 = r0.toString()
            if (r6 == 0) goto L_0x0026
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            java.lang.String r5 = "OTC_CREDIT_CARD_NUMBER"
            if (r0 == 0) goto L_0x0045
            X.7En r2 = r10.A07
            java.util.Map r0 = r2.A03
            r0.remove(r5)
            java.util.Map r0 = r2.A02
            java.lang.Object r1 = r0.remove(r5)
            X.56p r1 = (X.C880656p) r1
            if (r1 == 0) goto L_0x003f
            r0 = 0
            r1.A00 = r0
        L_0x003f:
            java.util.Map r0 = r2.A01
            r0.remove(r5)
        L_0x0044:
            return
        L_0x0045:
            X.7En r4 = r10.A07
            r3 = 0
            X.C04220Ms.A0B(r6, r7)
            X.AnonymousClass7GZ.A01(r8)
            java.security.KeyStore r0 = X.AnonymousClass7GZ.A01
            if (r0 == 0) goto L_0x007c
            java.security.KeyPair r0 = X.AnonymousClass7GZ.A00
            if (r0 == 0) goto L_0x007c
            javax.crypto.Cipher r1 = X.AnonymousClass7GZ.A02
            if (r1 == 0) goto L_0x007c
            java.lang.String r2 = "cipher"
            java.security.PublicKey r0 = r0.getPublic()
            r1.init(r7, r0)
            javax.crypto.Cipher r1 = X.AnonymousClass7GZ.A02
            if (r1 != 0) goto L_0x006c
            X.C04220Ms.A0E(r2)
            r0 = 0
            throw r0
        L_0x006c:
            byte[] r0 = X.AnonymousClass74V.A00(r6)
            byte[] r0 = r1.doFinal(r0)
            java.lang.String r6 = android.util.Base64.encodeToString(r0, r3)
            X.C04220Ms.A06(r6)
            goto L_0x0083
        L_0x007c:
            java.lang.String r1 = "CryptographyUtil"
            java.lang.String r0 = "isCryptographyInitialized is false"
            X.AnonymousClass0LU.A0B(r1, r0)
        L_0x0083:
            r4.A02(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Fc.A03(android.content.Context, X.57n, X.587):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.facebook.graphql.impls.CardVerificationFieldsImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.facebook.graphql.impls.CardVerificationFieldsImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: X.67L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.69W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.facebook.graphql.impls.CardVerificationFieldsImpl} */
    /* JADX WARNING: type inference failed for: r9v0, types: [X.8rA] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem A00(com.facebookpay.paymentmethod.model.PaymentMethod r25, java.lang.Integer r26, boolean r27) {
        /*
            r0 = r25
            boolean r2 = r0 instanceof com.facebookpay.paymentmethod.model.CreditCard
            r1 = 3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            if (r2 == 0) goto L_0x0087
            if (r27 == 0) goto L_0x0084
            X.69U r8 = X.AnonymousClass69U.A05
        L_0x000f:
            java.lang.String r16 = r0.Aal()
            r2 = r0
            r1 = r2
            com.facebookpay.paymentmethod.model.CreditCard r1 = (com.facebookpay.paymentmethod.model.CreditCard) r1
            java.lang.String r17 = r1.BH2()
            java.lang.String r18 = r1.BEm()
            com.facebook.graphql.impls.CreditCardCredentialImpl r5 = r1.A02
            X.67L r4 = X.AnonymousClass67L.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r3 = "cc_type"
            java.lang.Enum r11 = X.C86104wH.A0a(r5, r4, r3)
            X.67L r11 = (X.AnonymousClass67L) r11
            if (r11 != 0) goto L_0x002e
            r11 = r4
        L_0x002e:
            java.lang.String r3 = "last_four_digits"
            java.lang.String r19 = X.C86144wL.A0s(r5, r3)
            java.lang.String r20 = r1.A01()
            X.8rA r9 = r1.A00
            X.69W r12 = r1.A00()
            java.lang.String r5 = r1.A03
            com.facebook.graphql.impls.CardVerificationFieldsImpl r7 = r1.A01
            X.LcE r10 = r0.Aam()
            java.lang.String r22 = r1.AnP()
            boolean r3 = r1 instanceof com.facebookpay.paymentmethod.model.TokenizedCard
            if (r3 == 0) goto L_0x0081
            com.facebookpay.paymentmethod.model.TokenizedCard r1 = (com.facebookpay.paymentmethod.model.TokenizedCard) r1
            boolean r4 = r1.A04
        L_0x0052:
            r1 = 0
            if (r3 != 0) goto L_0x0056
            r2 = r1
        L_0x0056:
            com.facebookpay.paymentmethod.model.CreditCard r2 = (com.facebookpay.paymentmethod.model.CreditCard) r2
            if (r2 == 0) goto L_0x007f
            com.facebookpay.paymentmethod.model.TokenizedCard r2 = (com.facebookpay.paymentmethod.model.TokenizedCard) r2
            java.lang.String r2 = r2.A02
        L_0x005e:
            if (r3 != 0) goto L_0x0061
            r0 = r1
        L_0x0061:
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
            if (r0 == 0) goto L_0x0069
            com.facebookpay.paymentmethod.model.TokenizedCard r0 = (com.facebookpay.paymentmethod.model.TokenizedCard) r0
            java.lang.String r1 = r0.A03
        L_0x0069:
            java.lang.Integer r13 = X.AnonymousClass006.A0N
            r25 = 1
            r27 = 0
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r6 = new com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem
            r14 = r26
            r21 = r5
            r23 = r2
            r24 = r1
            r26 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r6
        L_0x007f:
            r2 = r1
            goto L_0x005e
        L_0x0081:
            boolean r4 = r1.A04
            goto L_0x0052
        L_0x0084:
            X.69U r8 = X.AnonymousClass69U.A0a
            goto L_0x000f
        L_0x0087:
            boolean r1 = r0 instanceof com.facebookpay.paymentmethod.model.PayPalCredential
            if (r1 == 0) goto L_0x00cb
            if (r27 == 0) goto L_0x00c8
            X.69U r8 = X.AnonymousClass69U.A05
        L_0x008f:
            r7 = 0
            java.lang.String r16 = r0.Aal()
            r1 = r0
            com.facebookpay.paymentmethod.model.PayPalCredential r1 = (com.facebookpay.paymentmethod.model.PayPalCredential) r1
            java.lang.String r17 = r1.BH2()
            java.lang.String r18 = r1.BEm()
            X.LcE r10 = r0.Aam()
            java.lang.String r22 = r1.AnP()
            r0 = 7
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
        L_0x00ac:
            java.lang.Integer r13 = X.AnonymousClass006.A0N
            r25 = 1
            r26 = 0
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r6 = new com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem
            r9 = r7
            r11 = r7
            r12 = r7
            r14 = r7
            r19 = r7
            r20 = r7
            r21 = r7
            r23 = r7
            r24 = r7
            r27 = r26
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r6
        L_0x00c8:
            X.69U r8 = X.AnonymousClass69U.A0a
            goto L_0x008f
        L_0x00cb:
            boolean r1 = r0 instanceof com.facebookpay.paymentmethod.model.APMCredential
            if (r1 == 0) goto L_0x00ea
            X.69U r8 = X.AnonymousClass69U.A05
            r7 = 0
            java.lang.String r16 = r0.Aal()
            r1 = r0
            com.facebookpay.paymentmethod.model.APMCredential r1 = (com.facebookpay.paymentmethod.model.APMCredential) r1
            java.lang.String r17 = r1.BH2()
            java.lang.String r18 = r1.BEm()
            X.LcE r10 = r0.Aam()
            java.lang.String r22 = r1.AnP()
            goto L_0x00ac
        L_0x00ea:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Fc.A00(com.facebookpay.paymentmethod.model.PaymentMethod, java.lang.Integer, boolean):com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem");
    }

    public static final ImmutableList A01(List list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NewCreditCardOptionImpl A00 = ((PaymentMethodComponentImpl.NewPaymentCredentialOptions) it.next()).A00();
            if (A00 != null) {
                C1366783w A0G = C18250wR.A0G(A00, NewCreditCardOptionImpl.AvailableCardTypesV2.class, "available_card_types_v2");
                while (A0G.hasNext()) {
                    builder.add((Object) AnonymousClass69W.A01(String.valueOf(C86104wH.A0a(((TreeJNI) A0G.next()).reinterpret(AvailableCardTypesImpl.class), AnonymousClass66O.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "card_type"))));
                }
            }
        }
        return C18250wR.A0F(builder);
    }
}
