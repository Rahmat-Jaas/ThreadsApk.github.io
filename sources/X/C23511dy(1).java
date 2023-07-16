package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape14S1200000_1_I2;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.util.ThreadTargetParcelable;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape25S0200000_I2_9;
import kotlin.jvm.internal.KtLambdaShape60S0100000_I2_40;

/* renamed from: X.1dy  reason: invalid class name and case insensitive filesystem */
public final class C23511dy extends AnonymousClass9NU implements C82424pb, C84474tC, C82034oy, C82524pq {
    public static final String __redex_internal_original_name = "CreatorMessagingSelectionScreenFragment";
    public int A00;
    public IgTextView A01;
    public AnonymousClass2OH A02;
    public SpinnerImageView A03;
    public String A04;
    public ArrayList A05;
    public List A06;
    public List A07;
    public Map A08;
    public boolean A09;
    public boolean A0A;
    public C85834vq A0B;
    public String A0C;
    public List A0D;
    public boolean A0E;
    public final C58943Ip A0F;
    public final C04530Oa A0G;
    public final C04530Oa A0H;
    public final C04530Oa A0I;
    public final C04530Oa A0J;
    public final C04530Oa A0K = C62373Zc.A00(this, 25);
    public final C04530Oa A0L;

    public final void BoZ() {
        this.A09 = false;
        A01(this);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C81524nw r0;
        C84754to hex;
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Bundle requireArguments = requireArguments();
        ThreadTargetParcelable threadTargetParcelable = (ThreadTargetParcelable) requireArguments.getParcelable("thread_id");
        if (threadTargetParcelable != null) {
            r0 = threadTargetParcelable.A00;
        } else {
            r0 = null;
        }
        this.A0B = (C85834vq) r0;
        this.A0C = requireArguments.getString("thread_v2_id");
        this.A0A = AnonymousClass0wJ.A1W(this.A0B);
        this.A0D = requireArguments.getStringArrayList("excluded_ids");
        this.A05 = requireArguments.getParcelableArrayList("existing_thread_members");
        this.A0E = requireArguments.getBoolean("has_epd_restricted_members");
        boolean z = this.A0A;
        int i = R.id.recipients_bar;
        if (z) {
            i = R.id.add_people_recipients_bar;
        }
        ViewGroup viewGroup = (ViewGroup) AnonymousClass0wJ.A0K(view2, i);
        C58943Ip r4 = this.A0F;
        UserSession A0X = AnonymousClass0wJ.A0X(this.A0K);
        C85834vq r11 = this.A0B;
        List list = this.A0D;
        ArrayList arrayList = this.A05;
        boolean z2 = this.A0E;
        AnonymousClass0wJ.A1P(A0X, viewGroup);
        Context requireContext = requireContext();
        r4.A00 = requireContext;
        r4.A04 = A0X;
        r4.A01 = this;
        r4.A07 = AnonymousClass0wJ.A1W(r11);
        r4.A05 = list;
        r4.A03 = new C30991Gcv(requireContext, viewGroup, r4.A08, A0X);
        if (r11 != null) {
            if (r11 instanceof MsysThreadId) {
                hex = new HEW(A0X);
            } else {
                H8D A002 = C60883Qx.A00(A0X);
                C04220Ms.A06(A002);
                hex = new HEX(new AnonymousClass34I(r11), A002, A0X);
            }
            C84754to r9 = hex;
            AnonymousClass49O A003 = AnonymousClass49O.A00(A0X);
            if (A003.A02 != null) {
                A003.A01();
            }
            A003.A02 = C18180wK.A0e();
            C32163H7y h7y = A003.A01;
            if (h7y != null) {
                A003.A03 = false;
                if (h7y.A02 != null) {
                    h7y.A02 = null;
                }
                String A0e = C18180wK.A0e();
                h7y.A02 = A0e;
                h7y.A00 = 4;
                if (A0e != null) {
                    USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(h7y.A03, "omnipicker_search_start"), 2453);
                    if (AnonymousClass0wJ.A1U(A0I2)) {
                        C62443a0.A01(A0I2, A0e);
                        A0I2.A0O(AnonymousClass284.GROUP_THREAD_DETAILS_MEMBERSHIP_ADD, "entry_surface");
                        A0I2.A0O(AnonymousClass285.MULTI_SELECT, "omnipicker_type");
                        if (h7y.A09) {
                            A0I2.A0O(AnonymousClass29I.EXPANDED_GLOBAL_SEACH, "search_mode");
                        }
                        if (h7y.A07) {
                            A0I2.A0Q("is_epd", Boolean.valueOf(h7y.A05));
                        }
                        A0I2.Bb4();
                    }
                }
            }
            C694948t r1 = A003.A00;
            if (r1 != null) {
                r1.A00 = null;
                r1.A01 = null;
                AnonymousClass3TO r5 = r1.A02;
                AnonymousClass7Ko.A07(r5.A09, "Must init with a valid delegate first!");
                if (r5.A0A == null) {
                    r5.A0A = C18180wK.A0e();
                }
            }
            if (arrayList != null) {
                r4.A02 = new AnonymousClass3TN(this, r9, A003, r11, A0X, AnonymousClass006.A00, arrayList, z2);
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        this.A03 = (SpinnerImageView) AnonymousClass0wJ.A0J(view2, R.id.loading_spinner);
        IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0J(view2, R.id.text_banner);
        C18180wK.A10(igTextView, this, 2131824647);
        this.A01 = igTextView;
        C04530Oa r42 = this.A0L;
        C18190wL.A1C(getViewLifecycleOwner(), ((C25971pk) r42.getValue()).A02, this, 17);
        C18190wL.A1E(getRecyclerView(), this, 0);
        SpinnerImageView spinnerImageView = this.A03;
        if (spinnerImageView == null) {
            C04220Ms.A0E("spinner");
            throw null;
        }
        spinnerImageView.setLoadingStatus(AnonymousClass69F.LOADING);
        ((C25971pk) r42.getValue()).A03(true, (String) null);
    }

    public static final void A00(FanClubCategoryType fanClubCategoryType, C23511dy r7, String str) {
        C320029u r2;
        Serializable serializable;
        AnonymousClass49J r4 = (AnonymousClass49J) r7.A0I.getValue();
        int ordinal = fanClubCategoryType.ordinal();
        if (ordinal == 1) {
            r2 = C320029u.MOST_RECENT_SUGGESTED_CATEGORY_ITEM;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                r2 = C320029u.LEAST_INTERACTED_SUGGESTED_CATEGORY_ITEM;
            }
            Bundle A062 = C18180wK.A06();
            A062.putParcelable("fan_club_category_type", fanClubCategoryType);
            A062.putString("fan_club_category_name", str);
            Bundle bundle = r7.mArguments;
            if (!(bundle == null || (serializable = bundle.getSerializable("entrypoint")) == null)) {
                A062.putSerializable("entrypoint", serializable);
            }
            C25786Drz A0Q = C18180wK.A0Q(r7.getActivity(), AnonymousClass0wJ.A0U(r7.A0K));
            A0Q.A0A(A062, new C23501dx());
            A0Q.A05();
        } else {
            r2 = C320029u.MOST_INTERACTED_SUGGESTED_CATEGORY_ITEM;
        }
        C319829s r3 = C319829s.NEW_SUBSCRIBER_CHAT;
        AnonymousClass49J.A00(AnonymousClass28X.TAP, C319929t.CHAT_CREATION_SHEET_RENDERED, r2, r3, r4, (Map) null);
        Bundle A0622 = C18180wK.A06();
        A0622.putParcelable("fan_club_category_type", fanClubCategoryType);
        A0622.putString("fan_club_category_name", str);
        Bundle bundle2 = r7.mArguments;
        A0622.putSerializable("entrypoint", serializable);
        C25786Drz A0Q2 = C18180wK.A0Q(r7.getActivity(), AnonymousClass0wJ.A0U(r7.A0K));
        A0Q2.A0A(A0622, new C23501dx());
        A0Q2.A05();
    }

    public static final void A01(C23511dy r4) {
        SpinnerImageView spinnerImageView;
        AnonymousClass69F r0;
        boolean z = r4.A09;
        Window A0F2 = C18180wK.A0F(r4);
        if (z) {
            A0F2.addFlags(16);
            spinnerImageView = r4.A03;
            if (spinnerImageView != null) {
                r0 = AnonymousClass69F.LOADING;
            }
            C04220Ms.A0E("spinner");
            throw null;
        }
        A0F2.clearFlags(16);
        spinnerImageView = r4.A03;
        if (spinnerImageView != null) {
            r0 = AnonymousClass69F.SUCCESS;
        }
        C04220Ms.A0E("spinner");
        throw null;
        spinnerImageView.setLoadingStatus(r0);
        C04220Ms.A0C(r4.getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        E2V.A0G(C18190wL.A0M(r4));
    }

    public final void BoR(FanClubCategoryType fanClubCategoryType, String str) {
        if (!this.A08.isEmpty()) {
            this.A0F.A03(new IDxCListenerShape14S1200000_1_I2((Object) fanClubCategoryType, (Object) this, str, 2), C18220wO.A0O(this, 42));
        } else {
            A00(fanClubCategoryType, this, str);
        }
    }

    public final void D8T() {
        ((AnonymousClass10N) this.A0L.getValue()).A01();
    }

    public final void D9j(User user) {
        if (!this.A08.containsKey(user.BK7())) {
            C58943Ip r3 = this.A0F;
            if (r3.A06()) {
                C25828Dsm A0V = AnonymousClass0wJ.A0V(this);
                A0V.A0L(2131824629);
                A0V.A0p(AnonymousClass0wJ.A0o(this, Integer.valueOf(AnonymousClass0wJ.A04(r3.A09.getValue())), 2131824628));
                C18180wK.A1N(A0V, this, 43, 2131831976);
                AnonymousClass0wJ.A1K(A0V);
                return;
            }
        }
        ((AnonymousClass10N) this.A0L.getValue()).A02(user);
        this.A0F.A05(this.A08, true);
    }

    public final Collection getDefinitions() {
        return C06750aI.A17(new AnonymousClass1kK(), new C24781kc(this), new C24991kx(this, this.A0F, AnonymousClass0wJ.A0X(this.A0K)), new AnonymousClass1kH());
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C139788Ph.A00);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0K);
    }

    public final boolean onBackPressed() {
        if (this.A0A || !(!this.A08.isEmpty())) {
            return false;
        }
        this.A0F.A03(C18220wO.A0O(this, 40), C18220wO.A0O(this, 41));
        return true;
    }

    public final void onSearchTextChanged(String str) {
        this.A04 = str;
        ((C25971pk) this.A0L.getValue()).A03(true, this.A04);
    }

    public C23511dy() {
        KtLambdaShape60S0100000_I2_40 ktLambdaShape60S0100000_I2_40 = new KtLambdaShape60S0100000_I2_40(this, 26);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape60S0100000_I2_40(new KtLambdaShape60S0100000_I2_40(this, 22), 23));
        this.A0L = C18220wO.A0M(new KtLambdaShape60S0100000_I2_40(A012, 24), ktLambdaShape60S0100000_I2_40, new KtLambdaShape25S0200000_I2_9(44, (Object) null, A012), C18210wN.A0l(C25971pk.class));
        this.A0I = C62373Zc.A00(this, 20);
        this.A0H = C62373Zc.A00(this, 19);
        this.A0G = C62373Zc.A00(this, 18);
        this.A0J = C62373Zc.A00(this, 21);
        this.A0F = new C58943Ip();
        this.A07 = AnonymousClass0wJ.A0v();
        this.A08 = C18220wO.A0y();
        this.A02 = C25951pi.A00;
    }

    public final void CER() {
        String str;
        C04220Ms.A0C(getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        E2V.A0G(C18190wL.A0M(this));
        if (!this.A07.isEmpty() || (!((str = this.A04) == null || str.length() == 0) || C04220Ms.A0I(this.A02, C25941ph.A00))) {
            this.A0F.A02();
            return;
        }
        C30991Gcv gcv = this.A0F.A03;
        if (gcv == null) {
            C04220Ms.A0E("recipientsBarController");
            throw null;
        } else {
            C18210wN.A0z(gcv.A06);
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        int i;
        int i2;
        AnonymousClass4u2.A05(r3);
        boolean z = this.A0A;
        Resources A0B2 = AnonymousClass0wJ.A0B(this);
        if (z) {
            r3.setTitle(A0B2.getString(2131824639));
            if (!this.A08.isEmpty()) {
                i = 2131824637;
                i2 = 316;
            } else {
                return;
            }
        } else {
            r3.setTitle(A0B2.getString(2131824623));
            if (this.A08.size() < 2 || this.A09) {
                r3.A7U(2131824620);
                return;
            } else {
                i = 2131824620;
                i2 = 317;
            }
        }
        r3.A7X(C18190wL.A0H(this, i2), i);
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(10353221);
        super.onDestroy();
        AnonymousClass3TN r0 = this.A0F.A02;
        if (r0 != null) {
            r0.A02.A01();
        }
        C14030oh.A09(-1844037793, A022);
    }
}
