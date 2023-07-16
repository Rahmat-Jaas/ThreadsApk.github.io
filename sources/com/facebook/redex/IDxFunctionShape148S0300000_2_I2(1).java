package com.facebook.redex;

import X.AnonymousClass74V;
import X.AnonymousClass7E9;
import X.AnonymousClass7EC;
import X.AnonymousClass8bP;
import X.C04220Ms;
import X.C111826oU;
import X.C129017kq;
import X.C18190wL;
import X.McB;
import android.util.Base64;
import com.facebook.pando.TreeJNI;
import com.instagram.graphql.instagramschemagraphservices.GetEncryptedCardNumberResponseImpl;
import java.security.PrivateKey;
import java.security.spec.MGF1ParameterSpec;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;

public class IDxFunctionShape148S0300000_2_I2 implements McB {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxFunctionShape148S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A01 = obj;
        this.A00 = obj3;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue;
        String stringValue;
        Object obj2 = obj;
        if (this.A03 != 0) {
            Throwable th = (Throwable) obj2;
            ((C129017kq) this.A00).A01(AnonymousClass7EC.A01(th));
            ((C111826oU) this.A01).A00();
            return th;
        }
        TreeJNI treeJNI = (TreeJNI) obj2;
        if (treeJNI == null || (treeValue = treeJNI.getTreeValue("autofill_encrypted_credit_card(data:$input)", GetEncryptedCardNumberResponseImpl.AutofillEncryptedCreditCard.class)) == null || (stringValue = treeValue.getStringValue("encrypted_card_number")) == null) {
            return null;
        }
        C129017kq r6 = (C129017kq) this.A01;
        C111826oU r5 = (C111826oU) this.A02;
        PrivateKey privateKey = ((AnonymousClass7E9) this.A00).A01.getPrivate();
        C04220Ms.A06(privateKey);
        List A0e = AnonymousClass8bP.A0e(stringValue, new char[]{'.'}, 0);
        if (A0e.size() == 5) {
            String A0p = C18190wL.A0p(A0e, 0);
            String A0p2 = C18190wL.A0p(A0e, 1);
            String A0p3 = C18190wL.A0p(A0e, 2);
            String A0p4 = C18190wL.A0p(A0e, 3);
            String A0p5 = C18190wL.A0p(A0e, 4);
            byte[] decode = Base64.decode(A0p2, 8);
            C04220Ms.A06(decode);
            Cipher instance = Cipher.getInstance("RSA/ECB/OAEPPadding");
            C04220Ms.A06(instance);
            instance.init(2, privateKey, new OAEPParameterSpec("SHA-1", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT));
            byte[] doFinal = instance.doFinal(decode);
            C04220Ms.A06(doFinal);
            byte[] decode2 = Base64.decode(A0p4, 8);
            C04220Ms.A06(decode2);
            byte[] bytes = A0p.getBytes(AnonymousClass74V.A01);
            C04220Ms.A06(bytes);
            byte[] decode3 = Base64.decode(A0p3, 8);
            C04220Ms.A06(decode3);
            byte[] decode4 = Base64.decode(A0p5, 8);
            C04220Ms.A06(decode4);
            if ((decode4.length << 3) == 128) {
                Cipher instance2 = Cipher.getInstance("AES/GCM/NoPadding");
                instance2.init(2, new SecretKeySpec(doFinal, "AES"), new GCMParameterSpec(128, decode3));
                instance2.updateAAD(bytes);
                instance2.update(decode2);
                byte[] doFinal2 = instance2.doFinal(decode4);
                C04220Ms.A06(doFinal2);
                r6.A01(AnonymousClass7EC.A00(new String(doFinal2, AnonymousClass74V.A05)));
                r5.A00();
                return Unit.A00;
            }
            throw new SecurityException("Tag size is invalid");
        }
        throw new SecurityException("JWE format is invalid");
    }
}
