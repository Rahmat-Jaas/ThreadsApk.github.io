package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0500000_I2;
import kotlin.jvm.internal.KtLambdaShape64S0100000_I2_44;

/* renamed from: X.1dV  reason: invalid class name */
public final class AnonymousClass1dV extends C34640IcN implements C21659By5 {
    public static final String __redex_internal_original_name = "GroupPreviewFragment";
    public ViewGroup A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgImageView A06;
    public C307522u A07 = C307522u.UNSPECIFIED;
    public C84174sg A08;
    public GroupLinkPreviewResponse$Success A09;
    public AvatarView A0A;
    public AvatarView A0B;
    public ProgressButton A0C;
    public SpinnerImageView A0D;
    public boolean A0E;
    public boolean A0F;
    public IgFrameLayout A0G;
    public AnonymousClass0ZU A0H;
    public final C04530Oa A0I = AnonymousClass0OY.A02(new KtLambdaShape64S0100000_I2_44(this, 24));
    public final C04530Oa A0J = C18220wO.A0M(new KtLambdaShape64S0100000_I2_44(this, 26), new KtLambdaShape64S0100000_I2_44(this, 27), C18250wR.A0d(this, (Object) null, 17), C18210wN.A0l(AnonymousClass10V.class));

    public final String getModuleName() {
        return "GroupLinkPreview";
    }

    public static final void A00(Activity activity, AnonymousClass1dV r3, String str) {
        if (activity != null && str != null) {
            AnonymousClass2NZ.A00(new AnonymousClass4Bk(activity, r3), C18180wK.A0W(r3, AnonymousClass0RA.A0C), str);
        }
    }

    public final void Bmo() {
        C84174sg r1 = this.A08;
        if (r1 != null) {
            r1.Bmp(this.A0E);
        }
        C307522u r12 = this.A07;
        if (r12 != C307522u.DIRECT_SEARCH && r12 != C307522u.NOTIFICATION && !C307522u.A00.A00(r12)) {
            AnonymousClass0ZU r0 = this.A0H;
            if (r0 != null) {
                r0.invoke();
            }
            this.A0H = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r9 != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bmq() {
        /*
            r10 = this;
            X.0Oa r0 = r10.A0J
            java.lang.Object r0 = r0.getValue()
            X.10V r0 = (X.AnonymousClass10V) r0
            X.3GK r2 = r0.A04
            if (r2 == 0) goto L_0x0089
            boolean r0 = r2 instanceof X.AnonymousClass1oh
            if (r0 != 0) goto L_0x0089
            boolean r0 = r2 instanceof X.AnonymousClass1oi
            if (r0 != 0) goto L_0x0089
            boolean r0 = r2 instanceof X.C25701og
            if (r0 != 0) goto L_0x0089
            X.1oj r2 = (X.AnonymousClass1oj) r2
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x009d
            com.instagram.service.session.UserSession r0 = r2.A05
            X.Dnj r1 = X.AnonymousClass6VR.A00(r0)
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r4 = r2.A04
            java.lang.Long r3 = r4.A03
            java.lang.String r0 = java.lang.String.valueOf(r3)
            com.instagram.user.model.User r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x009b
            X.22o r1 = r0.A02
        L_0x0034:
            X.22o r0 = X.C307022o.SUBSCRIBED
            boolean r9 = X.C18180wK.A1Z(r1, r0)
            X.0Oa r0 = r2.A07
            X.49Y r8 = X.C18240wQ.A0P(r0)
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r0 = r2.A03
            if (r0 == 0) goto L_0x0099
            int r7 = r0.A00
        L_0x0046:
            X.22u r6 = r2.A00
            java.lang.String r5 = r4.A09
            java.lang.String r4 = java.lang.String.valueOf(r3)
            r0 = 3
            X.C04220Ms.A0B(r4, r0)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.AnonymousClass49Y.A00(r8)
            r0 = 2
            if (r7 != r0) goto L_0x005c
            r1 = 1
            if (r9 == 0) goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0089
            if (r1 == 0) goto L_0x0089
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "creator_igid"
            r2.put(r0, r4)
            java.lang.String r1 = X.AnonymousClass49Y.A02(r6)
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "entrypoint"
            r2.put(r0, r1)
        L_0x0079:
            X.AnonymousClass49Y.A03(r3, r8)
            X.2AE r0 = X.AnonymousClass2AE.A0I
            X.AnonymousClass2A4.A00(r0, r3)
            X.Lci r0 = X.C40328Lci.A0U
            X.AnonymousClass3Zh.A03(r0, r3, r6, r5, r7)
            X.C18200wM.A1J(r3, r2)
        L_0x0089:
            androidx.fragment.app.FragmentActivity r2 = r10.getActivity()
            if (r2 == 0) goto L_0x0098
            r1 = 25
            kotlin.jvm.internal.KtLambdaShape64S0100000_I2_44 r0 = new kotlin.jvm.internal.KtLambdaShape64S0100000_I2_44
            r0.<init>(r2, r1)
            r10.A0H = r0
        L_0x0098:
            return
        L_0x0099:
            r7 = 1
            goto L_0x0046
        L_0x009b:
            r1 = 0
            goto L_0x0034
        L_0x009d:
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r7 = r2.A04
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x0089
            com.instagram.service.session.UserSession r6 = r2.A05
            X.Dnj r1 = X.AnonymousClass6VR.A00(r6)
            java.lang.Long r0 = r7.A03
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.instagram.user.model.User r5 = r1.A03(r0)
            if (r5 == 0) goto L_0x0089
            X.0Oa r0 = r2.A07
            X.49Y r4 = X.C18240wQ.A0P(r0)
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r0 = r2.A03
            if (r0 == 0) goto L_0x00d1
            int r3 = r0.A00
        L_0x00c1:
            X.22u r2 = r2.A00
            java.lang.String r1 = r7.A09
            X.Ctp r0 = X.C23527Ctp.A00(r6)
            boolean r0 = r0.A0N(r5)
            r4.A07(r2, r1, r3, r0)
            goto L_0x0089
        L_0x00d1:
            r3 = 1
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1dV.Bmq():void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        AnonymousClass7IE.A03(requireActivity(), AnonymousClass0wJ.A0B(this).getColor(R.color.igds_transparent_navigation_bar, requireActivity().getTheme()));
        super.onViewCreated(view2, bundle);
        this.A0F = AnonymousClass0wJ.A1W(requireArguments().getString("GroupPreviewFragment.STORY_ID_KEY"));
        IgFrameLayout igFrameLayout = (IgFrameLayout) view2;
        this.A0G = igFrameLayout;
        if (igFrameLayout != null) {
            this.A00 = (ViewGroup) C18230wP.A0G(C18190wL.A0T(igFrameLayout, R.id.group_preview_sheet_content_stub));
            IgFrameLayout igFrameLayout2 = this.A0G;
            if (igFrameLayout2 != null) {
                this.A0D = (SpinnerImageView) AnonymousClass0wJ.A0J(igFrameLayout2, R.id.group_preview_spinner);
                ViewGroup viewGroup = this.A00;
                if (viewGroup != null) {
                    this.A0B = (AvatarView) AnonymousClass0wJ.A0J(viewGroup, R.id.profile_photos);
                    ViewGroup viewGroup2 = this.A00;
                    if (viewGroup2 != null) {
                        IgImageView igImageView = (IgImageView) AnonymousClass0wJ.A0J(viewGroup2, R.id.subscriber_badge);
                        C18180wK.A0r(requireContext(), igImageView, R.drawable.instagram_icons_exceptions_illo_subscriber_crown2_filled_68);
                        this.A06 = igImageView;
                        ViewGroup viewGroup3 = this.A00;
                        if (viewGroup3 != null) {
                            this.A0A = (AvatarView) AnonymousClass0wJ.A0J(viewGroup3, R.id.avatar);
                            ViewGroup viewGroup4 = this.A00;
                            if (viewGroup4 != null) {
                                this.A05 = (IgTextView) AnonymousClass0wJ.A0J(viewGroup4, R.id.title);
                                ViewGroup viewGroup5 = this.A00;
                                if (viewGroup5 != null) {
                                    this.A04 = (IgTextView) AnonymousClass0wJ.A0J(viewGroup5, R.id.member_count);
                                    ViewGroup viewGroup6 = this.A00;
                                    if (viewGroup6 != null) {
                                        IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0J(viewGroup6, R.id.connected_text);
                                        igTextView.setVisibility(0);
                                        this.A01 = igTextView;
                                        ViewGroup viewGroup7 = this.A00;
                                        if (viewGroup7 != null) {
                                            IgTextView igTextView2 = (IgTextView) AnonymousClass0wJ.A0J(viewGroup7, R.id.join_explainer_text);
                                            igTextView2.setVisibility(0);
                                            this.A03 = igTextView2;
                                            ViewGroup viewGroup8 = this.A00;
                                            if (viewGroup8 != null) {
                                                ProgressButton progressButton = (ProgressButton) AnonymousClass0wJ.A0J(viewGroup8, R.id.join_chat_button);
                                                C31023Gdi gdi = new C31023Gdi();
                                                float A032 = C09860go.A03(getContext(), 8);
                                                if (gdi != C31023Gdi.A02) {
                                                    Arrays.fill(gdi.A01, A032);
                                                    gdi.A00 = AnonymousClass006.A00;
                                                }
                                                FCu fCu = new FCu(new RectF(), gdi, new C31023Gdi(), new C31023Gdi(), 1.0f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                                                ShapeDrawable shapeDrawable = new ShapeDrawable(fCu);
                                                Resources.Theme theme = requireActivity().getTheme();
                                                C29179Fje.A00(shapeDrawable, AnonymousClass0wJ.A0B(this).getColor(R.color.igds_primary_button, theme));
                                                ShapeDrawable shapeDrawable2 = new ShapeDrawable(fCu);
                                                C29179Fje.A00(shapeDrawable2, AnonymousClass0wJ.A0B(this).getColor(R.color.blue_5_30_transparent, theme));
                                                StateListDrawable stateListDrawable = new StateListDrawable();
                                                stateListDrawable.addState(new int[]{-16842910}, shapeDrawable2);
                                                stateListDrawable.addState(new int[0], shapeDrawable);
                                                progressButton.setBackground(stateListDrawable);
                                                progressButton.setEnabled(false);
                                                AnonymousClass0wJ.A16(progressButton, 377, this);
                                                this.A0C = progressButton;
                                                ViewGroup viewGroup9 = this.A00;
                                                if (viewGroup9 == null) {
                                                    C04220Ms.A0E("contentViewGroup");
                                                    throw null;
                                                }
                                                IgTextView igTextView3 = (IgTextView) AnonymousClass0wJ.A0J(viewGroup9, R.id.decline_invite_button);
                                                igTextView3.setVisibility(8);
                                                AnonymousClass0wJ.A16(igTextView3, 378, this);
                                                this.A02 = igTextView3;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C04220Ms.A0E("contentViewGroup");
                throw null;
            }
        }
        C04220Ms.A0E("rootViewGroup");
        throw null;
    }

    public final void afterOnViewCreated() {
        KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2;
        KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I22;
        AnonymousClass3J3.A00(getLifecycle()).A00(C18240wQ.A0n(this, (C146958n9) null, 0));
        AnonymousClass3J3.A00(getLifecycle()).A00(C18240wQ.A0n(this, (C146958n9) null, 1));
        AnonymousClass3J3.A00(getLifecycle()).A00(C18240wQ.A0n(this, (C146958n9) null, 2));
        AnonymousClass10V r2 = (AnonymousClass10V) this.A0J.getValue();
        Bundle requireArguments = requireArguments();
        GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success = this.A09;
        Serializable serializable = requireArguments.getSerializable("GroupPreviewFragment.JOINING_SURFACE");
        C04220Ms.A0C(serializable, "null cannot be cast to non-null type com.instagram.direct.channels.util.JoiningSurface");
        r2.A03 = (C307522u) serializable;
        r2.A06 = requireArguments.getString("GroupPreviewFragment.INVITE_LINK_SOURCE_KEY");
        String string = requireArguments.getString("GroupPreviewFragment.GROUP_LINK_HASH");
        KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I23 = null;
        if (string != null) {
            ktCSuperShape0S2000000_I2 = new KtCSuperShape0S2000000_I2(string, r2.A06, 24);
        } else {
            ktCSuperShape0S2000000_I2 = null;
        }
        r2.A00 = ktCSuperShape0S2000000_I2;
        String string2 = requireArguments.getString("GroupPreviewFragment.STORY_ID_KEY");
        if (string2 != null) {
            ktCSuperShape0S2000000_I22 = new KtCSuperShape0S2000000_I2(string2, requireArguments.getString("GroupPreviewFragment.CHAT_STICKER_CHANNEL_TYPE"), 26);
        } else {
            ktCSuperShape0S2000000_I22 = null;
        }
        r2.A02 = ktCSuperShape0S2000000_I22;
        String string3 = requireArguments.getString("GroupPreviewFragment.PINNED_SSC_THREAD_ID");
        if (string3 != null) {
            String string4 = requireArguments.getString("GroupPreviewFragment.FAN_CLUB_ID");
            if (string4 != null) {
                ktCSuperShape0S2000000_I23 = new KtCSuperShape0S2000000_I2(string3, string4, 25);
            } else {
                throw C18180wK.A0a("Creator with SSC must have a fanClubId");
            }
        }
        r2.A01 = ktCSuperShape0S2000000_I23;
        C28461uL r9 = r2.A07;
        KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I24 = r2.A00;
        KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I25 = r2.A02;
        r9.A01.D7w(C25741oq.A00);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0500000_I2(groupLinkPreviewResponse$Success, ktCSuperShape0S2000000_I24, ktCSuperShape0S2000000_I23, r9, ktCSuperShape0S2000000_I25, (C146958n9) null, 5), r9.A01, 3);
        r2.A05 = requireArguments.getString("GroupPreviewFragment.INVITE_ID_FROM_NOTIF");
    }

    public final C10300i6 getSession() {
        return C18200wM.A0V(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-95147176);
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("GroupPreviewFragment.JOINING_SURFACE");
        C04220Ms.A0C(serializable, "null cannot be cast to non-null type com.instagram.direct.channels.util.JoiningSurface");
        this.A07 = (C307522u) serializable;
        C14030oh.A09(-2022830603, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(712673213);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.group_preview_sheet, viewGroup, false);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout");
        C14030oh.A09(1839829510, A022);
        return inflate;
    }
}
