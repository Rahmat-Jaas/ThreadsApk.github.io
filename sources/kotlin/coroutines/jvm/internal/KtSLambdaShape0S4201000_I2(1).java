package kotlin.coroutines.jvm.internal;

import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass00U;
import X.AnonymousClass0OU;
import X.AnonymousClass0TJ;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass1jA;
import X.AnonymousClass1jB;
import X.AnonymousClass5v4;
import X.AnonymousClass7JB;
import X.AnonymousClass7JD;
import X.AnonymousClass7JJ;
import X.AnonymousClass7Kx;
import X.AnonymousClass84Y;
import X.C03480Iw;
import X.C04220Ms;
import X.C10450iM;
import X.C110336lW;
import X.C111946oh;
import X.C121027Ds;
import X.C121277Fh;
import X.C122157Kv;
import X.C1373788i;
import X.C146958n9;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C25074DfF;
import X.C25515Dn3;
import X.C28736FaG;
import X.C28929FeV;
import X.C39142Kno;
import X.C62903b6;
import X.C63803iN;
import X.C86164wN;
import X.C880856r;
import X.C882557i;
import X.C92875kA;
import X.C971167z;
import X.C99866Lb;
import X.D0E;
import X.FFF;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl;
import com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl;
import com.facebook.graphql.impls.FBPayECPAvailabilityImpl;
import com.facebook.graphql.impls.FBPayLoggingPolicyImpl;
import com.facebook.graphql.impls.FBPayPaymentConfigImpl;
import com.facebook.graphql.impls.FBPayReceiverInfoImpl;
import com.facebook.graphql.impls.FBPayTransactionInfoImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingPolicy;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.camera.effect.models.CameraAREffect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

public class KtSLambdaShape0S4201000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S4201000_I2(Object obj, Object obj2, String str, String str2, String str3, String str4, C146958n9 r8, int i) {
        super(2, r8);
        this.A07 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A01 = obj2;
    }

    public final C146958n9 create(Object obj, C146958n9 r11) {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj2;
        Object obj3;
        int i;
        C146958n9 r7 = r11;
        if (this.A07 != 0) {
            obj3 = this.A02;
            str4 = this.A03;
            str3 = this.A05;
            str = this.A06;
            str2 = this.A04;
            obj2 = this.A01;
            i = 1;
        } else {
            str = this.A06;
            str2 = this.A04;
            str3 = this.A05;
            str4 = this.A03;
            obj2 = this.A01;
            obj3 = this.A02;
            i = 0;
        }
        return new KtSLambdaShape0S4201000_I2(obj3, obj2, str4, str3, str, str2, r7, i);
    }

    public final Object invokeSuspend(Object obj) {
        C880856r r3;
        Object obj2;
        CheckoutSetupMutationResponseImpl.CheckoutSetupMutation checkoutSetupMutation;
        FBPayTransactionInfoImpl fBPayTransactionInfoImpl;
        Set set;
        Set set2;
        FBPayReceiverInfoImpl fBPayReceiverInfoImpl;
        String str;
        boolean z;
        C121027Ds r5;
        String str2;
        Object obj3 = obj;
        int i = this.A07;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (i != 0) {
            if (this.A00 != 0) {
                AnonymousClass0OU.A00(obj3);
            } else {
                AnonymousClass0OU.A00(obj3);
                C121027Ds r0 = (C121027Ds) this.A02;
                EffectCollectionService effectCollectionService = r0.A0A;
                String str3 = this.A03;
                C25515Dn3 dn3 = C25515Dn3.A0B;
                long j = r0.A09;
                String str4 = this.A05;
                String str5 = this.A06;
                C04220Ms.A0B(str3, 1);
                this.A00 = 1;
                obj3 = EffectCollectionService.A04(effectCollectionService, dn3, str3, str4, str5, this, j);
                if (obj3 == d0e) {
                    return d0e;
                }
            }
            C62903b6 r32 = (C62903b6) obj3;
            Object obj4 = null;
            if (r32 instanceof AnonymousClass1jA) {
                Object obj5 = ((AnonymousClass1jA) r32).A00;
                obj4 = obj5;
                CameraAREffect cameraAREffect = (CameraAREffect) obj5;
                if (!cameraAREffect.A0L() || this.A05 != null) {
                    r5 = (C121027Ds) this.A02;
                    r5.A02 = AnonymousClass00J.A0J(AnonymousClass00J.A0V(r5.A02, C18180wK.A0n(cameraAREffect)));
                } else {
                    r5 = (C121027Ds) this.A02;
                    if (!C63803iN.A0E(AnonymousClass0TJ.A05, r5.A0C.A00, 36315645000026788L)) {
                        obj4 = null;
                    } else {
                        r5.A01 = AnonymousClass00J.A0J(AnonymousClass00J.A0V(r5.A01, C18180wK.A0n(cameraAREffect)));
                    }
                }
                if (!(obj5 == null || (str2 = this.A05) == null)) {
                    Map map = r5.A0E;
                    String str6 = cameraAREffect.A0I;
                    C04220Ms.A06(str6);
                    map.put(str6, str2);
                }
            } else if (r32 instanceof AnonymousClass1jB) {
                C99866Lb r8 = (C99866Lb) ((AnonymousClass1jB) r32).A00;
                String str7 = this.A03;
                String A0e = C18210wN.A0e(r8);
                if (r8 instanceof AnonymousClass5v4) {
                    AnonymousClass5v4 r82 = (AnonymousClass5v4) r8;
                    A0e = AnonymousClass00U.A0h(A0e, " failure reason:", r82.A01, "Failure code:", r82.A00);
                }
                C10450iM.A03("RtcArEffectsManager", AnonymousClass00U.A0d("Failed fetching effect id ", str7, " due to: ", A0e));
            }
            C111946oh r1 = ((C121027Ds) this.A02).A00;
            if (r1 != null) {
                long parseLong = Long.parseLong(this.A03);
                CameraAREffect cameraAREffect2 = (CameraAREffect) obj4;
                String str8 = this.A04;
                Integer num = (Integer) this.A01;
                C04220Ms.A0B(num, 3);
                C28736FaG faG = r1.A00;
                if (cameraAREffect2 == null) {
                    faG.A0Q.A01(parseLong);
                    faG.A0L.A01();
                } else if (!C04220Ms.A0I(C28736FaG.A00(faG).A05, cameraAREffect2)) {
                    Object value = faG.A0V.getValue();
                    if ((value == C971167z.ON || value == C971167z.PENDING || AnonymousClass0wJ.A1X(faG.A0W.getValue())) && (num == AnonymousClass006.A01 || num == AnonymousClass006.A0C)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    FFF A002 = C28736FaG.A00(faG);
                    C121027Ds r02 = faG.A0J;
                    C28736FaG.A09(faG, FFF.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C28929FeV) null, A002, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, r02.A02, (List) null, r02.A01, (List) null, (List) null, (List) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -34, false, false, false, false, false, false, false, false, false, false, false));
                    if (z) {
                        C28736FaG.A07(C25074DfF.A00(cameraAREffect2, (String) null, false), faG);
                        if (cameraAREffect2.A0L() || cameraAREffect2.A0I()) {
                            C28736FaG.A04(cameraAREffect2, faG, num, str8);
                        } else {
                            C28736FaG.A05(cameraAREffect2, faG, num, (String) null, 6);
                        }
                    }
                }
            }
        } else {
            if (this.A00 != 0) {
                AnonymousClass0OU.A00(obj3);
            } else {
                AnonymousClass0OU.A00(obj3);
                ECPRepositoryImpl A022 = AnonymousClass7JJ.A02();
                String str9 = this.A06;
                String str10 = this.A04;
                String str11 = this.A05;
                String str12 = this.A03;
                this.A00 = 1;
                obj3 = ECPRepositoryImpl.A00(A022, (LoggingPolicy) null, str9, str10, str11, str12, (String) null, (List) null, this);
                if (obj3 == d0e) {
                    return d0e;
                }
            }
            AnonymousClass7Kx r33 = (AnonymousClass7Kx) obj3;
            if (AnonymousClass7Kx.A0R(r33)) {
                Object obj6 = r33.A01;
                CheckoutSetupMutationResponseImpl checkoutSetupMutationResponseImpl = (CheckoutSetupMutationResponseImpl) obj6;
                FBPayLoggingPolicyImpl fBPayLoggingPolicyImpl = null;
                if (checkoutSetupMutationResponseImpl != null) {
                    checkoutSetupMutation = checkoutSetupMutationResponseImpl.A00();
                } else {
                    checkoutSetupMutation = null;
                }
                if (checkoutSetupMutation != null) {
                    String str13 = this.A06;
                    String str14 = this.A04;
                    String str15 = this.A05;
                    FBPayECPAvailabilityImpl fBPayECPAvailabilityImpl = null;
                    FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl = null;
                    FBPayPaymentConfigImpl fBPayPaymentConfigImpl = null;
                    ECPPaymentRequest A0D = C122157Kv.A0D(checkoutSetupMutation, (ECPConfirmationConfiguration) null, (EcpUIConfiguration) this.A01, str13, C18190wL.A0n(C03480Iw.A00()), str14);
                    TreeJNI treeValue = checkoutSetupMutation.getTreeValue("transaction_info", CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.TransactionInfo.class);
                    if (treeValue == null || (fBPayTransactionInfoImpl = (FBPayTransactionInfoImpl) treeValue.reinterpret(FBPayTransactionInfoImpl.class)) == null) {
                        throw C18180wK.A0a("Required value was null.");
                    }
                    TransactionInfo A0H = C122157Kv.A0H(fBPayTransactionInfoImpl);
                    ECPRepositoryImpl A023 = AnonymousClass7JJ.A02();
                    CheckoutConfiguration checkoutConfiguration = A0D.A01;
                    if (checkoutConfiguration != null) {
                        set = checkoutConfiguration.A0B;
                        set2 = checkoutConfiguration.A0C;
                    } else {
                        set = AnonymousClass84Y.A00;
                        set2 = set;
                    }
                    boolean A0A = A023.A0A(str14, set, set2);
                    if (obj6 != null) {
                        boolean A0Q = C122157Kv.A0Q(checkoutSetupMutationResponseImpl);
                        CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.ReceiverInfo A003 = checkoutSetupMutation.A00();
                        if (A003 != null) {
                            fBPayReceiverInfoImpl = (FBPayReceiverInfoImpl) A003.reinterpret(FBPayReceiverInfoImpl.class);
                        } else {
                            fBPayReceiverInfoImpl = null;
                        }
                        TreeJNI A0K = C86164wN.A0K(checkoutSetupMutation);
                        if (A0K != null) {
                            fBPayECPAvailabilityImpl = (FBPayECPAvailabilityImpl) A0K.reinterpret(FBPayECPAvailabilityImpl.class);
                        }
                        TreeJNI treeValue2 = checkoutSetupMutation.getTreeValue("checkout_screen_config", CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.CheckoutScreenConfig.class);
                        if (treeValue2 != null) {
                            fBPayCheckoutScreenConfigImpl = (FBPayCheckoutScreenConfigImpl) treeValue2.reinterpret(FBPayCheckoutScreenConfigImpl.class);
                        }
                        TreeJNI treeValue3 = checkoutSetupMutation.getTreeValue("payment_config", CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.PaymentConfig.class);
                        if (treeValue3 != null) {
                            fBPayPaymentConfigImpl = (FBPayPaymentConfigImpl) treeValue3.reinterpret(FBPayPaymentConfigImpl.class);
                        }
                        TreeJNI treeValue4 = checkoutSetupMutation.getTreeValue("logging_policy", CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.LoggingPolicy.class);
                        if (treeValue4 != null) {
                            fBPayLoggingPolicyImpl = (FBPayLoggingPolicyImpl) treeValue4.reinterpret(FBPayLoggingPolicyImpl.class);
                        }
                        checkoutSetupMutation.getStringValue("order_id");
                        C110336lW r24 = new C110336lW(fBPayCheckoutScreenConfigImpl, fBPayECPAvailabilityImpl, fBPayLoggingPolicyImpl, fBPayPaymentConfigImpl, fBPayReceiverInfoImpl);
                        if (A0A) {
                            str = "NUX";
                        } else {
                            str = "PUX";
                        }
                        ArrayList A012 = AnonymousClass7JB.A01(r24, (OtcInput) null, (LoggingPolicy) null, str13, str14, str15, str, A0Q);
                        if (A0A) {
                            C121277Fh.A03(C121277Fh.A00(A012), new IDxObserverShape55S0300000_2_I2(9, this.A02, (Object) A0H, (Object) A0D));
                        } else {
                            r3 = ((C882557i) this.A02).A06;
                            obj2 = C18180wK.A0p(A0D, A0H);
                        }
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            } else if (AnonymousClass7Kx.A0O(r33)) {
                Throwable th = r33.A02;
                if (th == null || !(th instanceof C92875kA)) {
                    r3 = ((C882557i) this.A02).A05;
                    obj2 = new C1373788i(0, "", "");
                } else {
                    AnonymousClass7JD.A02(((C882557i) this.A02).A05, th);
                }
            }
            AnonymousClass7JD.A02(r3, obj2);
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S4201000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
