package com.instagram.business.fragment;

import X.AnonymousClass06E;
import X.AnonymousClass0wJ;
import X.AnonymousClass1fW;
import X.AnonymousClass2KX;
import X.AnonymousClass3IK;
import X.AnonymousClass3VX;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18220wO;
import X.C18230wP;
import X.C23671ey;
import X.C24711ju;
import X.C311924p;
import X.C34640IcN;
import X.C37408JrQ;
import X.C61853Wb;
import X.C62163Xl;
import X.C63483hZ;
import X.C67133yv;
import X.C67173yz;
import X.C67293zJ;
import X.C682042s;
import X.C82034oy;
import X.C82424pb;
import X.C84264sr;
import X.C84654td;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.model.business.BusinessInfo;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Map;

public class FBPageListWithPreviewFragment extends C34640IcN implements C82424pb, C82034oy, C84264sr {
    public AnonymousClass1fW A00;
    public BusinessFlowAnalyticsLogger A01;
    public C84654td A02;
    public PageSelectionOverrideData A03;
    public C682042s A04;
    public AnonymousClass3IK A05;
    public AnonymousClass3IK A06;
    public C10300i6 A07;
    public BusinessInfo A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public AnonymousClass4u2 A0E;
    public String A0F;
    public boolean A0G;
    public final Handler A0H = AnonymousClass0wJ.A0F();
    public BusinessNavBar mBusinessNavBar;
    public C24711ju mBusinessNavBarHelper;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mRecyclerView;
    public IgdsStepperHeader mStepperHeader;

    public static void A00(FBPageListWithPreviewFragment fBPageListWithPreviewFragment) {
        AnonymousClass3IK r0;
        C62163Xl r1;
        FBPageListWithPreviewFragment fBPageListWithPreviewFragment2 = fBPageListWithPreviewFragment;
        fBPageListWithPreviewFragment.A04.A04("continue");
        AnonymousClass1fW r02 = fBPageListWithPreviewFragment.A00;
        AnonymousClass3IK r12 = r02.A03;
        fBPageListWithPreviewFragment.A06 = r12;
        AnonymousClass3IK r2 = r02.A02;
        fBPageListWithPreviewFragment.A05 = r2;
        C682042s r03 = fBPageListWithPreviewFragment.A04;
        r03.A04 = r2;
        r03.A05 = r12;
        if (r2 != null) {
            C62163Xl r13 = new C62163Xl();
            r13.A0B = r2.A07;
            r13.A01 = r2.A04;
            r13.A00 = r2.A03;
            String str = r2.A08;
            r13.A0J = str;
            BusinessInfo businessInfo = new BusinessInfo(r13);
            BusinessInfo businessInfo2 = fBPageListWithPreviewFragment.A08;
            if (businessInfo2 != null) {
                if (businessInfo2.A0N) {
                    r1 = new C62163Xl(businessInfo2);
                    r1.A0J = str;
                } else {
                    String str2 = businessInfo2.A09;
                    r1 = new C62163Xl(businessInfo);
                    r1.A09 = str2;
                }
                businessInfo = new BusinessInfo(r1);
            }
            fBPageListWithPreviewFragment.A08 = businessInfo;
            C84654td r04 = fBPageListWithPreviewFragment.A02;
            if (r04 != null) {
                C67133yv A0R = AnonymousClass0wJ.A0R(r04);
                BusinessInfo businessInfo3 = fBPageListWithPreviewFragment.A08;
                if (businessInfo3 != null) {
                    A0R.A06 = businessInfo3;
                }
                if (C67293zJ.A04(fBPageListWithPreviewFragment.A02) && (r0 = fBPageListWithPreviewFragment.A05) != null) {
                    AnonymousClass0wJ.A0R(fBPageListWithPreviewFragment.A02).A0F = r0.A05;
                }
            }
            C682042s r4 = fBPageListWithPreviewFragment.A04;
            BusinessInfo businessInfo4 = fBPageListWithPreviewFragment.A08;
            if (r4.A09 || r4.A0C || r4.A0B || r4.A0A) {
                C84654td r3 = r4.A02;
                C67133yv A0R2 = AnonymousClass0wJ.A0R(r3);
                if (businessInfo4 != null) {
                    A0R2.A06 = businessInfo4;
                }
                C10300i6 r22 = r4.A07;
                if (!C63483hZ.A07(r22) || r4.A04.A08.equals(AnonymousClass0wJ.A0Y(C05030Qo.A02(r22)).A17())) {
                    if (r4.A0C || r4.A0B) {
                        C682042s.A01(r4);
                    } else {
                        r3.Bel(r4.A03());
                    }
                    C682042s.A00(r4);
                    return;
                }
                Context context = r4.A00.getContext();
                AnonymousClass3IK r05 = r4.A04;
                AnonymousClass2KX.A00(context, r4, fBPageListWithPreviewFragment2, C05030Qo.A02(r22), r05.A08, r05.A05, C61853Wb.A00(C682042s.A0G, r22, "ig_professional_fb_page_linking"), r4.A08, "business_conversion");
            }
        }
    }

    public final String getModuleName() {
        return "fb_page_list_with_preview";
    }

    public final void AHz() {
        if (this.A0C) {
            this.A0E.AJT(false);
            this.A0E.setIsLoading(true);
        }
    }

    public final void AJV() {
        if (this.A0C) {
            this.A0E.AJT(true);
            this.A0E.setIsLoading(false);
        }
    }

    public final void CJ9() {
        if (!this.A0D && !this.A0C && this.A02 != null) {
            this.A04.A04("skip");
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
            if (businessFlowAnalyticsLogger != null) {
                businessFlowAnalyticsLogger.Bdo(new C37408JrQ("page_selection", this.A04.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            }
            C84654td r0 = this.A02;
            if (r0 != null) {
                C18220wO.A1N(r0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.AnonymousClass4u2 r5) {
        /*
            r4 = this;
            r4.A0E = r5
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x002e
            r0 = 2131828998(0x7f112106, float:1.9290953E38)
        L_0x0009:
            r5.Cqb(r0)
        L_0x000c:
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0019
            X.Drc r1 = X.C18180wK.A0N()
            r0 = 141(0x8d, float:1.98E-43)
            X.AnonymousClass4u2.A04(r1, r5, r4, r0)
        L_0x0019:
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x002d
            r3 = 0
            r0 = 142(0x8e, float:1.99E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r2 = X.C18190wL.A0H(r4, r0)
            r1 = 0
            X.Dk8 r0 = new X.Dk8
            r0.<init>(r2, r3, r1)
            r5.Crr(r0)
        L_0x002d:
            return
        L_0x002e:
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x000c
            r0 = 2131835504(0x7f113a70, float:1.9304148E38)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.FBPageListWithPreviewFragment.configureActionBar(X.4u2):void");
    }

    public final C10300i6 getSession() {
        return this.A07;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        C682042s r4 = this.A04;
        boolean z = this.A0G;
        boolean z2 = r4.A0C;
        if (!z2 && !r4.A0B && (businessFlowAnalyticsLogger = r4.A01) != null) {
            businessFlowAnalyticsLogger.BbZ(new C37408JrQ("page_selection", r4.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (z2 || r4.A0B) {
            C84654td r0 = r4.A02;
            r0.getClass();
            r0.ACI();
            return true;
        }
        C84654td r02 = r4.A02;
        if (r02 == null) {
            return false;
        }
        if (z) {
            C18230wP.A1Q(r02);
        }
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        Map A0y;
        IgdsStepperHeader igdsStepperHeader;
        int A002;
        int A003;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        RecyclerView A0L = C18230wP.A0L(view2);
        this.mRecyclerView = A0L;
        this.mBusinessNavBar.A01(A0L);
        if (this.A0C) {
            this.mBusinessNavBar.setVisibility(8);
        }
        C84654td r0 = this.A02;
        if (r0 != null) {
            C311924p r1 = ((BusinessConversionActivity) r0).A02;
            String str = "_flowType";
            if (r1 != null) {
                if (r1 == C311924p.SHOPPING_IN_APP_SIGNUP_FLOW || r1 == C311924p.SERVICE_ONBOARDING_FLOW) {
                    IgdsStepperHeader igdsStepperHeader2 = (IgdsStepperHeader) view2.requireViewById(R.id.stepper_header);
                    this.mStepperHeader = igdsStepperHeader2;
                    igdsStepperHeader2.setVisibility(0);
                    PageSelectionOverrideData pageSelectionOverrideData = this.A03;
                    if (pageSelectionOverrideData != null) {
                        igdsStepperHeader = this.mStepperHeader;
                        A002 = pageSelectionOverrideData.A01;
                        A003 = pageSelectionOverrideData.A00;
                    } else {
                        C84654td r02 = this.A02;
                        if (r02 != null) {
                            igdsStepperHeader = this.mStepperHeader;
                            AnonymousClass3VX r12 = ((BusinessConversionActivity) r02).A01;
                            if (r12 != null) {
                                A002 = AnonymousClass3VX.A00(r12, r12.A00.A00 + 1) - 1;
                                AnonymousClass3VX r13 = ((BusinessConversionActivity) this.A02).A01;
                                if (r13 != null) {
                                    A003 = AnonymousClass3VX.A00(r13, r13.A00.A01.size());
                                }
                            }
                            str = "conversionLogic";
                        }
                    }
                    igdsStepperHeader.A01(A002, A003);
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        this.mLoadingSpinner = (SpinnerImageView) view2.requireViewById(R.id.loading_indicator);
        Context requireContext = requireContext();
        AnonymousClass06E A004 = AnonymousClass06E.A00(this);
        C10300i6 r9 = this.A07;
        Context requireContext2 = requireContext();
        String str2 = this.A0A;
        C67173yz.A00(requireContext, A004, new C23671ey(requireContext2, this.A01, this.A02, this, this.A05, r9, str2, this.A09, this.A0B), r9, this.A0F);
        C682042s r3 = this.A04;
        C84654td r2 = r3.A02;
        if (r2 != null && (businessFlowAnalyticsLogger = r3.A01) != null) {
            if (r3.A09) {
                A0y = r2.AeU((Map) null);
            } else {
                A0y = AnonymousClass0wJ.A0y();
            }
            businessFlowAnalyticsLogger.Bdt(new C37408JrQ("page_selection", r3.A08, (String) null, (String) null, (String) null, A0y, (Map) null, (Map) null));
        }
    }

    public final void CCX() {
        A00(this);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A02 = C67293zJ.A01(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009a, code lost:
        if (r2 != X.C311924p.SHOPPING_IN_APP_SIGNUP_FLOW) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00aa, code lost:
        if (r2 != X.C311924p.SERVICE_ONBOARDING_FLOW) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        if (r2 != com.instagram.business.controller.datamodel.ConversionStep.RENEW) goto L_0x00bc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = 1122105077(0x42e1f6f5, float:112.98234)
            int r3 = X.C14030oh.A02(r0)
            r8 = r13
            super.onCreate(r14)
            android.os.Bundle r5 = r13.requireArguments()
            X.0i6 r0 = X.C18190wL.A0S(r5)
            r13.A07 = r0
            java.lang.String r0 = "entry_point"
            java.lang.String r0 = X.C18190wL.A0j(r5, r0)
            r13.A0A = r0
            java.lang.String r0 = "EXTRA_FB_OVERRIDE_DATA"
            android.os.Parcelable r0 = r5.getParcelable(r0)
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = (com.instagram.business.controller.datamodel.PageSelectionOverrideData) r0
            r13.A03 = r0
            X.4td r0 = r13.A02
            if (r0 == 0) goto L_0x0039
            X.0i6 r2 = r13.A07
            X.24p r1 = r0.Aiz()
            X.4td r0 = r13.A02
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = X.C18190wL.A0O(r1, r13, r2, r0)
            r13.A01 = r0
        L_0x0039:
            X.0i6 r4 = r13.A07
            X.4td r2 = r13.A02
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r13.A01
            X.42s r1 = new X.42s
            r1.<init>(r13, r0, r2, r4)
            r13.A04 = r1
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r13.A03
            if (r0 == 0) goto L_0x004c
            r1.A03 = r0
        L_0x004c:
            java.lang.String r0 = r13.A0A
            r1.A08 = r0
            X.4td r0 = r13.A02
            if (r0 == 0) goto L_0x019f
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            java.lang.String r0 = r0.A0G
        L_0x005a:
            r13.A0B = r0
            X.4td r0 = r13.A02
            if (r0 == 0) goto L_0x0195
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            com.instagram.model.business.BusinessInfo r4 = r0.A06
        L_0x0066:
            r13.A08 = r4
            X.42s r0 = r13.A04
            X.4td r2 = r0.A02
            if (r2 == 0) goto L_0x008d
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r2)
            com.instagram.model.business.BusinessInfo r0 = r0.A07
            if (r0 == 0) goto L_0x008d
            X.3Xl r1 = new X.3Xl
            r1.<init>(r4)
            java.lang.String r0 = r0.A0J
            r1.A0J = r0
            r0 = 1
            r1.A0N = r0
            com.instagram.model.business.BusinessInfo r4 = new com.instagram.model.business.BusinessInfo
            r4.<init>((X.C62163Xl) r1)
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r2)
            r0.A06 = r4
        L_0x008d:
            r13.A08 = r4
            X.4td r0 = r13.A02
            if (r0 == 0) goto L_0x009c
            X.24p r2 = r0.Aiz()
            X.24p r1 = X.C311924p.SHOPPING_IN_APP_SIGNUP_FLOW
            r0 = 1
            if (r2 == r1) goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            r13.A0D = r0
            X.4td r0 = r13.A02
            if (r0 == 0) goto L_0x00ac
            X.24p r2 = r0.Aiz()
            X.24p r1 = X.C311924p.SERVICE_ONBOARDING_FLOW
            r0 = 1
            if (r2 == r1) goto L_0x00ad
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            r13.A0C = r0
            X.4td r0 = r13.A02
            if (r0 == 0) goto L_0x00bc
            com.instagram.business.controller.datamodel.ConversionStep r2 = r0.CWQ()
            com.instagram.business.controller.datamodel.ConversionStep r1 = com.instagram.business.controller.datamodel.ConversionStep.RENEW
            r0 = 0
            if (r2 == r1) goto L_0x00bd
        L_0x00bc:
            r0 = 1
        L_0x00bd:
            r13.A0G = r0
            X.42s r1 = r13.A04
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r1.A03
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = r0.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d3
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r1.A03
            java.lang.String r12 = r0.A04
            if (r12 != 0) goto L_0x00eb
        L_0x00d3:
            android.content.Context r1 = r13.requireContext()
            X.42s r0 = r13.A04
            boolean r2 = r0.A0D
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131824304(0x7f110eb0, float:1.9281432E38)
            if (r2 == 0) goto L_0x00e7
            r0 = 2131829648(0x7f112390, float:1.9292271E38)
        L_0x00e7:
            java.lang.String r12 = r1.getString(r0)
        L_0x00eb:
            X.42s r1 = r13.A04
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r1.A03
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ff
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r1.A03
            java.lang.String r11 = r0.A03
            if (r11 != 0) goto L_0x0111
        L_0x00ff:
            X.4td r0 = r13.A02
            if (r0 == 0) goto L_0x013a
            X.24p r1 = r0.Aiz()
            X.24p r0 = X.C311924p.CREATOR_CONVERSION_FLOW
        L_0x0109:
            if (r1 != r0) goto L_0x014e
            java.lang.String r2 = ""
        L_0x010d:
            java.lang.String r11 = r2.toString()
        L_0x0111:
            android.content.Context r7 = r13.requireContext()
            X.0i6 r1 = r13.A07
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x0138
            com.instagram.service.session.UserSession r10 = X.C05030Qo.A02(r1)
        L_0x011f:
            X.1fW r6 = new X.1fW
            r9 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.A00 = r6
            X.0i6 r1 = r13.A07
            X.4td r0 = r13.A02
            java.lang.String r0 = X.C67293zJ.A03(r0, r1)
            r13.A0F = r0
            r0 = 1181942443(0x467302ab, float:15552.667)
            X.C14030oh.A09(r0, r3)
            return
        L_0x0138:
            r10 = 0
            goto L_0x011f
        L_0x013a:
            X.0i6 r1 = r13.A07
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x014e
            com.instagram.user.model.User r0 = X.C04660Oo.A00(r1)
            r0.getClass()
            X.266 r1 = r0.A0g()
            X.266 r0 = X.AnonymousClass266.A05
            goto L_0x0109
        L_0x014e:
            android.content.Context r7 = r13.requireContext()
            X.0i6 r0 = r13.A07
            java.lang.String r1 = X.C05030Qo.A04(r0)
            X.42s r0 = r13.A04
            boolean r0 = r0.A0D
            X.0i6 r6 = r13.A07
            if (r0 == 0) goto L_0x0188
            if (r1 == 0) goto L_0x0188
            r1 = 2131824299(0x7f110eab, float:1.9281422E38)
            boolean r5 = X.C18210wN.A1V(r6)
            r0 = 2131829285(0x7f112225, float:1.9291535E38)
            java.lang.String r4 = X.AnonymousClass0wJ.A0k(r7, r0)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r7, r4, r1)
            X.C04220Ms.A06(r0)
            android.text.SpannableStringBuilder r2 = X.C18200wM.A0E(r0)
            int r1 = X.C18210wN.A01(r7)
            com.instagram.ui.text.IDxCSpanShape62S0200000_1_I2 r0 = new com.instagram.ui.text.IDxCSpanShape62S0200000_1_I2
            r0.<init>(r1, r5, r7, r6)
            X.AnonymousClass3Zw.A01(r2, r0, r4)
            goto L_0x010d
        L_0x0188:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131824305(0x7f110eb1, float:1.9281434E38)
            java.lang.String r2 = r1.getString(r0)
            goto L_0x010d
        L_0x0195:
            java.lang.String r0 = "business_info"
            android.os.Parcelable r4 = r5.getParcelable(r0)
            com.instagram.model.business.BusinessInfo r4 = (com.instagram.model.business.BusinessInfo) r4
            goto L_0x0066
        L_0x019f:
            java.lang.String r0 = "target_page_id"
            java.lang.String r0 = r5.getString(r0)
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.FBPageListWithPreviewFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r8.A02 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r0.CWP() != null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 1000815852(0x3ba73cec, float:0.005103698)
            int r2 = X.C14030oh.A02(r0)
            r0 = 2131493816(0x7f0c03b8, float:1.8611123E38)
            r5 = 0
            android.view.View r7 = r9.inflate(r0, r10, r5)
            com.instagram.business.ui.BusinessNavBar r4 = X.C18240wQ.A0N(r7)
            r8.mBusinessNavBar = r4
            X.4td r0 = r8.A02
            if (r0 == 0) goto L_0x0022
            com.instagram.business.controller.datamodel.ConversionStep r0 = r0.CWP()
            r3 = 2131826219(0x7f11162b, float:1.9285316E38)
            if (r0 == 0) goto L_0x0025
        L_0x0022:
            r3 = 2131831737(0x7f112bb9, float:1.9296508E38)
        L_0x0025:
            r1 = 2131826220(0x7f11162c, float:1.9285318E38)
            X.1ju r0 = new X.1ju
            r0.<init>((com.instagram.business.ui.BusinessNavBar) r4, (X.C84264sr) r8, (int) r3, (int) r1)
            r8.mBusinessNavBarHelper = r0
            com.instagram.business.ui.BusinessNavBar r4 = r8.mBusinessNavBar
            boolean r0 = r8.A0D
            if (r0 != 0) goto L_0x003e
            boolean r0 = r8.A0C
            if (r0 != 0) goto L_0x003e
            X.4td r0 = r8.A02
            r3 = 1
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            com.instagram.common.ui.text.TitleTextView r1 = r4.A03
            r0 = 8
            if (r3 == 0) goto L_0x0046
            r0 = 0
        L_0x0046:
            r1.setVisibility(r0)
            r4.A00()
            X.42s r3 = r8.A04
            com.instagram.business.ui.BusinessNavBar r6 = r8.mBusinessNavBar
            androidx.fragment.app.Fragment r1 = r3.A00
            r0 = 2131829574(0x7f112346, float:1.929212E38)
            java.lang.String r4 = r1.getString(r0)
            X.0i6 r3 = r3.A07
            r0 = 2131827002(0x7f11193a, float:1.9286904E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0o(r1, r4, r0)
            java.lang.String r0 = "https://help.instagram.com/402748553849926"
            r6.setFooterTerms(r3, r4, r1, r0)
            android.view.View r1 = r6.A00
            r0 = 8
            r1.setVisibility(r0)
            android.widget.LinearLayout r0 = r6.A02
            r0.setVisibility(r5)
            com.instagram.common.ui.text.TitleTextView r0 = r6.A03
            r0.setPadding(r5, r5, r5, r5)
            r6.A00()
            X.42s r1 = r8.A04
            X.1ju r0 = r8.mBusinessNavBarHelper
            r1.A06 = r0
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r8.A03
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = r0.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0096
            com.instagram.business.ui.BusinessNavBar r1 = r8.mBusinessNavBar
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r8.A03
            java.lang.String r0 = r0.A06
            r1.setPrimaryButtonText((java.lang.CharSequence) r0)
        L_0x0096:
            X.1ju r0 = r8.mBusinessNavBarHelper
            r8.registerLifecycleListener(r0)
            r0 = 604869572(0x240d93c4, float:3.0699664E-17)
            X.C14030oh.A09(r0, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.FBPageListWithPreviewFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1257104011);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        C14030oh.A09(285532217, A022);
    }
}
