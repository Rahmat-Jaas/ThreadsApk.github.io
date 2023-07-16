package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2;
import kotlin.jvm.internal.KtLambdaShape25S0200000_I2_9;
import kotlin.jvm.internal.KtLambdaShape60S0100000_I2_40;

/* renamed from: X.1dx  reason: invalid class name and case insensitive filesystem */
public final class C23501dx extends AnonymousClass9NU implements C82424pb, C84474tC, C82034oy {
    public static final String __redex_internal_original_name = "CreatorMessagingCategorySelectionScreenFragment";
    public int A00;
    public FanClubCategoryType A01;
    public IgTextView A02;
    public AnonymousClass24R A03;
    public AnonymousClass2OH A04;
    public SpinnerImageView A05;
    public String A06;
    public String A07;
    public List A08;
    public Map A09;
    public boolean A0A;
    public boolean A0B;
    public final C58943Ip A0C;
    public final C04530Oa A0D;
    public final C04530Oa A0E = C62373Zc.A00(this, 14);
    public final C04530Oa A0F;

    public final void BoZ() {
        this.A0A = false;
        A00(this);
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        String str = this.A06;
        if (str == null) {
            C04220Ms.A0E("categoryName");
            throw null;
        }
        AnonymousClass4u2.A08(r3, str);
        if (this.A09.size() < 2 || this.A0A) {
            r3.A7U(2131824620);
        } else {
            r3.A7X(C18190wL.A0H(this, 314), 2131824620);
        }
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass0wJ.A0K(view, R.id.recipients_bar);
        C58943Ip r5 = this.A0C;
        UserSession A0X = AnonymousClass0wJ.A0X(this.A0E);
        C04220Ms.A0B(A0X, 1);
        Context A0A2 = C18240wQ.A0A(this, viewGroup, 3);
        r5.A00 = A0A2;
        r5.A04 = A0X;
        r5.A01 = this;
        r5.A07 = false;
        r5.A05 = null;
        r5.A03 = new C30991Gcv(A0A2, viewGroup, r5.A08, A0X);
        this.A05 = (SpinnerImageView) AnonymousClass0wJ.A0J(view, R.id.loading_spinner);
        this.A02 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.text_banner);
        C04530Oa r4 = this.A0F;
        C18190wL.A1C(getViewLifecycleOwner(), ((C25961pj) r4.getValue()).A00, this, 16);
        SpinnerImageView spinnerImageView = this.A05;
        if (spinnerImageView == null) {
            C04220Ms.A0E("spinner");
            throw null;
        }
        spinnerImageView.setLoadingStatus(AnonymousClass69F.LOADING);
        C62793ak A0N = C18200wM.A0N(r4);
        FanClubCategoryType fanClubCategoryType = this.A01;
        if (fanClubCategoryType == null) {
            C04220Ms.A0E("categoryType");
            throw null;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0211000_I2(A0N, fanClubCategoryType, (C146958n9) null, 11, false), AnonymousClass3J5.A00(A0N), 3);
    }

    public static final void A00(C23501dx r4) {
        SpinnerImageView spinnerImageView;
        AnonymousClass69F r0;
        boolean z = r4.A0A;
        Window A0F2 = C18180wK.A0F(r4);
        if (z) {
            A0F2.addFlags(16);
            spinnerImageView = r4.A05;
            if (spinnerImageView != null) {
                r0 = AnonymousClass69F.LOADING;
            }
            C04220Ms.A0E("spinner");
            throw null;
        }
        A0F2.clearFlags(16);
        spinnerImageView = r4.A05;
        if (spinnerImageView != null) {
            r0 = AnonymousClass69F.SUCCESS;
        }
        C04220Ms.A0E("spinner");
        throw null;
        spinnerImageView.setLoadingStatus(r0);
        C04220Ms.A0C(r4.getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        E2V.A0G(C18190wL.A0M(r4));
    }

    public final void D8T() {
        C319829s r3;
        ((AnonymousClass10N) this.A0F.getValue()).A01();
        if (!this.A0B) {
            AnonymousClass49J r4 = (AnonymousClass49J) this.A0D.getValue();
            FanClubCategoryType fanClubCategoryType = this.A01;
            if (fanClubCategoryType == null) {
                C04220Ms.A0E("categoryType");
                throw null;
            }
            int ordinal = fanClubCategoryType.ordinal();
            if (ordinal == 1) {
                r3 = C319829s.MOST_RECENT_SUBSCRIBERS_LIST;
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    r3 = C319829s.LEAST_INTERACTED_SUBSCRIBERS_LIST;
                }
                this.A0B = true;
            } else {
                r3 = C319829s.MOST_INTERACTED_SUBSCRIBERS_LIST;
            }
            AnonymousClass49J.A00(AnonymousClass28X.TAP, C319929t.UNSELECT_ALL, C320029u.UNSELECT_ALL_USERS_OPTION, r3, r4, (Map) null);
            this.A0B = true;
        }
    }

    public final void D9j(User user) {
        ((AnonymousClass10N) this.A0F.getValue()).A02(user);
        this.A0C.A05(this.A09, true);
    }

    public final Collection getDefinitions() {
        return C06750aI.A17(new AnonymousClass1kK(), new C24991kx(this, this.A0C, AnonymousClass0wJ.A0X(this.A0E)), new AnonymousClass1kH());
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C139778Pg.A00);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0E);
    }

    public final boolean onBackPressed() {
        if (this.A09.size() == this.A00) {
            return false;
        }
        this.A0C.A03(C18220wO.A0O(this, 38), C18220wO.A0O(this, 39));
        return true;
    }

    public final void onSearchTextChanged(String str) {
        C86074wE r5;
        ArrayList arrayList;
        this.A07 = str;
        C25961pj r1 = (C25961pj) this.A0F.getValue();
        String str2 = this.A07;
        C86074wE r6 = r1.A00;
        r6.CrC(C25941ph.A00);
        FanClubMemberListCategoryRepository fanClubMemberListCategoryRepository = r1.A02;
        if (str2 == null || str2.length() == 0) {
            r5 = fanClubMemberListCategoryRepository.A01;
            arrayList = null;
        } else {
            r5 = fanClubMemberListCategoryRepository.A01;
            arrayList = AnonymousClass0wJ.A0v();
            for (Object next : (Iterable) fanClubMemberListCategoryRepository.A00.getValue()) {
                String BK7 = ((User) ((KtCSuperShape0S1100000_I2) next).A00).BK7();
                C04220Ms.A0B(BK7, 0);
                if (BK7.startsWith(str2)) {
                    arrayList.add(next);
                }
            }
        }
        r5.CrC(arrayList);
        r6.CrC(C25931pg.A00);
    }

    public C23501dx() {
        KtLambdaShape60S0100000_I2_40 ktLambdaShape60S0100000_I2_40 = new KtLambdaShape60S0100000_I2_40(this, 15);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape60S0100000_I2_40(new KtLambdaShape60S0100000_I2_40(this, 11), 12));
        this.A0F = C18220wO.A0M(new KtLambdaShape60S0100000_I2_40(A012, 13), ktLambdaShape60S0100000_I2_40, new KtLambdaShape25S0200000_I2_9(43, (Object) null, A012), C18210wN.A0l(C25961pj.class));
        this.A0D = C62373Zc.A00(this, 10);
        this.A0C = new C58943Ip();
        this.A08 = AnonymousClass0wJ.A0v();
        this.A09 = C18220wO.A0y();
        this.A04 = C25951pi.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (X.C04220Ms.A0I(r2.A04, X.C25941ph.A00) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CER() {
        /*
            r2 = this;
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity"
            X.C04220Ms.A0C(r1, r0)
            X.E2V r0 = X.C18190wL.A0M(r2)
            X.E2V.A0G(r0)
            java.util.List r0 = r2.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r2.A07
            if (r0 == 0) goto L_0x0022
            int r0 = r0.length()
            if (r0 != 0) goto L_0x002d
        L_0x0022:
            X.2OH r1 = r2.A04
            X.1ph r0 = X.C25941ph.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            X.3Ip r0 = r2.A0C
            if (r1 == 0) goto L_0x0043
            X.Gcv r0 = r0.A03
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "recipientsBarController"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x003d:
            android.view.ViewGroup r0 = r0.A06
            X.C18210wN.A0z(r0)
            return
        L_0x0043:
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23501dx.CER():void");
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        Object obj;
        int A022 = C14030oh.A02(-815028032);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("fan_club_category_type");
        if (parcelable != null) {
            this.A01 = (FanClubCategoryType) parcelable;
            String string = requireArguments().getString("fan_club_category_name");
            if (string != null) {
                this.A06 = string;
                Bundle bundle2 = this.mArguments;
                AnonymousClass24R r2 = null;
                if (bundle2 != null) {
                    obj = bundle2.getSerializable("entrypoint");
                } else {
                    obj = null;
                }
                if (obj instanceof AnonymousClass24R) {
                    r2 = (AnonymousClass24R) obj;
                }
                this.A03 = r2;
                C14030oh.A09(-1763299737, A022);
                return;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 1624184579;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -547620466;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }
}
