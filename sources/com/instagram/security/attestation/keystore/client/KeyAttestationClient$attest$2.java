package com.instagram.security.attestation.keystore.client;

import X.AnonymousClass01V;
import X.AnonymousClass0MJ;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass6CP;
import X.AnonymousClass74V;
import X.C04220Ms;
import X.C10300i6;
import X.C107566gx;
import X.C111776oN;
import X.C113476rU;
import X.C129957nk;
import X.C146958n9;
import X.C18180wK;
import X.C18220wO;
import X.C18250wR;
import X.C28174Ezk;
import X.C29786Fu6;
import X.C39142Kno;
import X.C63233h2;
import X.C67463zb;
import X.C86144wL;
import X.C86154wM;
import X.C93945sv;
import X.C973268x;
import X.D0E;
import android.security.keystore.StrongBoxUnavailableException;
import android.util.Base64;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5000000_I2;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.IgAppAttestationAndroidKeystoreChallengeValidateResponseImpl;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.util.Random;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.security.attestation.keystore.client.KeyAttestationClient$attest$2", f = "KeyAttestationClient.kt", i = {0, 0, 1, 1, 1, 1, 1, 1}, l = {84, 139}, m = "invokeSuspend", n = {"keyHash", "instanceKey", "keyHash", "challengeNonce", "keyNonce", "encodedCertificateChain", "signedNonceBase64", "instanceKey"}, s = {"L$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
public final class KeyAttestationClient$attest$2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final /* synthetic */ C10300i6 A07;
    public final /* synthetic */ KeyAttestationClient A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyAttestationClient$attest$2(C10300i6 r2, KeyAttestationClient keyAttestationClient, C146958n9 r4, boolean z) {
        super(2, r4);
        this.A08 = keyAttestationClient;
        this.A07 = r2;
        this.A09 = z;
    }

    public final C146958n9 create(Object obj, C146958n9 r6) {
        return new KeyAttestationClient$attest$2(this.A07, this.A08, r6, this.A09);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        AnonymousClass0MJ r5;
        String str2;
        String str3;
        String str4;
        AnonymousClass01V r0;
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000;
        byte[] bArr;
        Object obj2 = obj;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i2 = this.A01;
        if (i2 != 0) {
            i = this.A00;
            if (i2 != 1) {
                str = (String) this.A06;
                r5 = (AnonymousClass0MJ) this.A05;
                str2 = (String) this.A04;
                str3 = (String) this.A03;
                str4 = (String) this.A02;
                try {
                    AnonymousClass0OU.A00(obj2);
                    r0 = this.A08.A02;
                    r0.markerPoint(533731830, i, "validate_end");
                    r0.markerEnd(533731830, i, 2);
                    C04220Ms.A09(str);
                    return new KtCSuperShape0S5000000_I2(str3, str, str2, str4, (String) r5.A00, 0);
                } catch (Throwable th) {
                    this.A08.A02.markerPoint(533731830, i, "validate_end");
                    throw th;
                }
            } else {
                str4 = (String) this.A02;
                AnonymousClass0OU.A00(obj2);
            }
        } else {
            AnonymousClass0OU.A00(obj2);
            i = new Random().nextInt();
            KeyAttestationClient keyAttestationClient = this.A08;
            AnonymousClass01V r9 = keyAttestationClient.A02;
            r9.markerStart(533731830, i);
            C113476rU r2 = keyAttestationClient.A01;
            try {
                if (r2.A00.A00.containsAlias("w6CmevIyM/PL6Q5uUDw=")) {
                    str4 = r2.A01();
                    C04220Ms.A06(str4);
                    USLEBaseShape0S0000000 uSLEBaseShape0S00000002 = keyAttestationClient.A00;
                    if (uSLEBaseShape0S00000002 != null) {
                        uSLEBaseShape0S00000002.A0Q("has_existing_key", true);
                    }
                } else {
                    str4 = "";
                }
                try {
                    r9.markerPoint(533731830, i, "nonce_start");
                    C10300i6 r1 = this.A07;
                    String str5 = keyAttestationClient.A04;
                    this.A02 = str4;
                    this.A00 = i;
                    this.A01 = 1;
                    obj2 = KeyAttestationClient.A00(r1, keyAttestationClient, str5, str4, this);
                    if (obj2 == d0e) {
                        return d0e;
                    }
                } catch (Throwable th2) {
                    this.A08.A02.markerPoint(533731830, i, "nonce_end");
                    throw th2;
                }
            } catch (NullPointerException | KeyStoreException e) {
                throw new AnonymousClass6CP("Unable to check key existance", e);
            }
        }
        C93945sv r12 = (C93945sv) obj2;
        KeyAttestationClient keyAttestationClient2 = this.A08;
        r0 = keyAttestationClient2.A02;
        r0.markerPoint(533731830, i, "nonce_end");
        if (r12 != null) {
            C107566gx r122 = r12.A00;
            if (r122 == null) {
                C18250wR.A0m();
                throw null;
            }
            str3 = r122.A00;
            USLEBaseShape0S0000000 uSLEBaseShape0S00000003 = keyAttestationClient2.A00;
            if (uSLEBaseShape0S00000003 != null) {
                uSLEBaseShape0S00000003.A0Q("has_challenge_nonce", true);
            }
            str2 = r122.A01;
            USLEBaseShape0S0000000 uSLEBaseShape0S00000004 = keyAttestationClient2.A00;
            if (uSLEBaseShape0S00000004 != null) {
                uSLEBaseShape0S00000004.A0Q("has_key_nonce", true);
            }
            boolean A1W = AnonymousClass0wJ.A1W(str2);
            r5 = C86144wL.A17();
            if (A1W) {
                C113476rU r22 = keyAttestationClient2.A01;
                C113476rU r19 = r22;
                C111776oN r15 = r22.A00;
                try {
                    KeyStore keyStore = r15.A00;
                    if (keyStore.containsAlias("w6CmevIyM/PL6Q5uUDw=")) {
                        try {
                            keyStore.deleteEntry("w6CmevIyM/PL6Q5uUDw=");
                        } catch (KeyStoreException e2) {
                            throw new AnonymousClass6CP("Unable to delete key", e2);
                        }
                    }
                    if (str2 != null) {
                        bArr = AnonymousClass74V.A00(str2);
                    } else {
                        bArr = null;
                    }
                    C973268x r13 = C973268x.EC;
                    try {
                        r15.A00(r13, bArr, true);
                    } catch (ProviderException e3) {
                        if (e3 instanceof StrongBoxUnavailableException) {
                            r15.A00(r13, bArr, false);
                        } else {
                            throw new AnonymousClass6CP("Unable to generate attested key", e3);
                        }
                    }
                    str4 = r19.A01();
                    C04220Ms.A06(str4);
                    r5.A00 = r19.A00();
                } catch (NullPointerException | KeyStoreException e4) {
                    throw new AnonymousClass6CP("Unable to check key existance", e4);
                }
            }
            USLEBaseShape0S0000000 uSLEBaseShape0S00000005 = keyAttestationClient2.A00;
            if (uSLEBaseShape0S00000005 != null) {
                uSLEBaseShape0S00000005.A0T("key_hash", str4);
            }
            Object obj3 = r5.A00;
            if (!(obj3 == null || (uSLEBaseShape0S0000000 = keyAttestationClient2.A00) == null)) {
                uSLEBaseShape0S0000000.A0Q("has_encoded_certificate_chain", Boolean.valueOf(C18180wK.A1X(((CharSequence) obj3).length())));
            }
            byte[] A002 = AnonymousClass74V.A00(str3);
            C113476rU r92 = keyAttestationClient2.A01;
            C113476rU r192 = r92;
            try {
                KeyStore.Entry entry = r92.A00.A00.getEntry("w6CmevIyM/PL6Q5uUDw=", (KeyStore.ProtectionParameter) null);
                try {
                    if (entry instanceof KeyStore.PrivateKeyEntry) {
                        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
                        Signature instance = Signature.getInstance(C973268x.valueOf(privateKeyEntry.getCertificate().getPublicKey().getAlgorithm()).A00);
                        instance.initSign(privateKeyEntry.getPrivateKey());
                        instance.update(A002);
                        str = Base64.encodeToString(instance.sign(), 10);
                        if (this.A09) {
                            C04220Ms.A06(str);
                            Object obj4 = r5.A00;
                            C04220Ms.A0B(str4, 0);
                            GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
                            A0L.A0D(str4, "key_hash");
                            A0L.A0D(str3, "challenge_nonce");
                            A0L.A0D(str, "challenge_nonce_signed");
                            A0L.A0D(keyAttestationClient2.A04, "app_scoped_device_id");
                            if (obj4 != null) {
                                A0L.A0D(r192.A00(), C28174Ezk.A00(485));
                            }
                            C67463zb A003 = C67463zb.A00();
                            C67463zb A004 = C67463zb.A00();
                            C67463zb.A01(A0L, A003);
                            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C63233h2.A00(), "IgAppAttestationAndroidKeystoreChallengeValidate", A003.getParamsCopy(), A004.getParamsCopy(), IgAppAttestationAndroidKeystoreChallengeValidateResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "xfb_ig_app_attestation_android_keystore_challenge_validate");
                            C129957nk r132 = new C129957nk();
                            r0.markerPoint(533731830, i, "validate_start");
                            keyAttestationClient2.A03.AMA(pandoGraphQLRequest, r132);
                            this.A02 = str4;
                            this.A03 = str3;
                            this.A04 = str2;
                            this.A05 = r5;
                            this.A06 = str;
                            this.A00 = i;
                            this.A01 = 2;
                            if (C29786Fu6.A00(r132.A00, this) == d0e) {
                                return d0e;
                            }
                            r0 = this.A08.A02;
                            r0.markerPoint(533731830, i, "validate_end");
                        }
                        r0.markerEnd(533731830, i, 2);
                        C04220Ms.A09(str);
                        return new KtCSuperShape0S5000000_I2(str3, str, str2, str4, (String) r5.A00, 0);
                    }
                    throw C18180wK.A0a("Attestation key is not PrivateKeyEntry in keystore");
                } catch (IllegalArgumentException | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e5) {
                    throw new AnonymousClass6CP("Unable to sign data", e5);
                }
            } catch (NullPointerException | UnsupportedOperationException | KeyStoreException | NoSuchAlgorithmException | ProviderException | UnrecoverableEntryException e6) {
                throw new AnonymousClass6CP("Unable to get entry", e6);
            }
        } else {
            throw C18180wK.A0a("Server did not respond with a challenge nonce");
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KeyAttestationClient$attest$2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
