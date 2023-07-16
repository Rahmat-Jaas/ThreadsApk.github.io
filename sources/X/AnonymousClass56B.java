package X;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.IDxDObserverShape52S0100000_2_I2;
import androidx.recyclerview.widget.IDxSListenerShape59S0100000_2_I2;
import androidx.recyclerview.widget.RecyclerView;
import com.facebookpay.msc.appdialog.viewmodel.AppDialogViewModel;
import com.facebookpay.msc.earningdetail.viewmodel.EarningsDetailViewModel;
import com.facebookpay.msc.earningdetail.viewmodel.EarningsDetailViewModelV2;
import com.facebookpay.msc.earnings.viewmodel.EarningsViewModel;
import com.facebookpay.msc.feselector.viewmodel.FeSelectorViewModel;
import com.facebookpay.msc.filter.viewmodel.FilterViewModel;
import com.facebookpay.msc.infotip.viewmodel.InfoTipViewModel;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel;
import com.facebookpay.msc.overview.viewmodel.OverviewViewModel;
import com.facebookpay.msc.payoutdetails.viewmodel.PayoutDetailsViewModel;
import com.facebookpay.msc.payoutdetails.viewmodel.PayoutDetailsViewModelV2;
import com.facebookpay.msc.payouts.viewmodel.PayoutsViewModel;
import com.facebookpay.msc.settings.viewmodel.SettingsViewModel;
import com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel;
import com.instagram.barcelona.R;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5;

/* renamed from: X.56B  reason: invalid class name */
public class AnonymousClass56B extends Fragment implements C143618h2, C143558gw {
    public static final SparseArray A09;
    public Dialog A00;
    public ProgressBar A01;
    public AnonymousClass5AA A02;
    public ListSectionViewModel A03;
    public boolean A04;
    public boolean A05;
    public final C880756q A06 = C880756q.A01();
    public final C143158gC A07 = C86114wI.A0Q(this, 97);
    public final C04530Oa A08;

    static {
        SparseArray A0D = C86154wM.A0D();
        A09 = A0D;
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, new AnonymousClass7jY(R.style.BSCIGTheme), (C143568gx) null, 0), 0);
        AnonymousClass7Kz.A0S(A0D, A00(2131886173, 0), 28);
        AnonymousClass7Kz.A0S(A0D, A00(R.style.BSCIGTheme, 0), 19);
        AnonymousClass7Kz.A0S(A0D, A00(2131886167, 0), 17);
        AnonymousClass7jY r2 = new AnonymousClass7jY(2131886166);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, r2, new C128407jX(2131886171), 0), 20);
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, new C128407jX(R.style.BSCIGTheme), (C143568gx) null, 0), 52);
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, new AnonymousClass7jY(R.style.BSCIGTheme), (C143568gx) null, 0), 1);
        AnonymousClass7Kz.A0S(A0D, A00(2131886165, 0), 30);
        AnonymousClass7jY r0 = new AnonymousClass7jY(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, A01(r0, R.style.BSCIGTheme), 27);
        AnonymousClass7Kz.A0S(A0D, A00(R.style.BSCIGTheme, 0), 2);
        AnonymousClass7jY r22 = new AnonymousClass7jY(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, r22, new AnonymousClass7jY(R.style.BSCIGTheme), 0), 23);
        C128407jX r02 = new C128407jX(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, A01(r02, R.style.BSCIGTheme), 3);
        C128407jX r8 = new C128407jX(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg(r8, new AnonymousClass7jY(R.style.BSCIGTheme), (C143568gx) null, 0), 21);
        AnonymousClass7Kz.A0Q();
        C128407jX r82 = new C128407jX(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg(r82, new AnonymousClass7jY(R.style.BSCIGTheme), (C143568gx) null, R.style.BSCIGTheme), 15);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7jY r9 = new AnonymousClass7jY(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7jY r83 = new AnonymousClass7jY(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg(r9, r83, new C128407jX(2131886171), R.style.BSCIGTheme), 6);
        C128407jX r03 = new C128407jX(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, A01(r03, R.style.BSCIGTheme), 7);
        C128407jX r04 = new C128407jX(2131886183);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, A01(r04, 2131886175), 43);
        C128407jX r05 = new C128407jX(2131886184);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, A01(r05, 2131886175), 49);
        AnonymousClass7jY r84 = new AnonymousClass7jY(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128477jf(r84, new C128397jW(R.style.BSCIGTheme)), 12);
        AnonymousClass7Kz.A0S(A0D, new C128447jc(2131886168), 4);
        AnonymousClass7Kz.A0S(A0D, new C128437jb(), 31);
        AnonymousClass7jY r85 = new AnonymousClass7jY(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, r85, new AnonymousClass7jY(R.style.BSCIGTheme), 0), 8);
        C128407jX r10 = new C128407jX(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7jY r86 = new AnonymousClass7jY(2131886175);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg(r10, r86, new AnonymousClass7jY(R.style.BSCIGTheme), 0), 9);
        AnonymousClass7jY r87 = new AnonymousClass7jY(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, r87, new AnonymousClass7jY(R.style.BSCIGTheme), 0), 10);
        AnonymousClass7jY r88 = new AnonymousClass7jY(2131886170);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, r88, new AnonymousClass7jY(2131886169), 0), 18);
        AnonymousClass7jY r06 = new AnonymousClass7jY(2131886174);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, A01(r06, 2131886174), 29);
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, new C128397jW(R.style.BSCIGTheme), (C143568gx) null, 0), 11);
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, new C128397jW(R.style.BSCIGTheme), (C143568gx) null, 0), 54);
        AnonymousClass7jV r23 = new AnonymousClass7jV();
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, r23, new C128407jX(R.style.BSCIGTheme), 0), 13);
        C128407jX r07 = new C128407jX(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, A01(r07, R.style.BSCIGTheme), 14);
        C128407jX r92 = new C128407jX(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7jY r24 = new AnonymousClass7jY(2131886175);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg(r92, r24, new C128417jZ(R.style.BSCIGTheme), 0), 16);
        AnonymousClass7Kz.A0S(A0D, A00(2131886166, 0), 24);
        AnonymousClass7Kz.A0S(A0D, A00(2131886166, 0), 53);
        AnonymousClass7Kz.A0Q();
        C128407jX r11 = new C128407jX(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7jY r25 = new AnonymousClass7jY(2131886175);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg(r11, r25, new AnonymousClass7jY(R.style.BSCIGTheme), R.style.BSCIGTheme), 22);
        AnonymousClass7Kz.A0Q();
        C128407jX r112 = new C128407jX(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7jY r26 = new AnonymousClass7jY(2131886175);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg(r112, r26, new AnonymousClass7jY(R.style.BSCIGTheme), R.style.BSCIGTheme), 32);
        C128427ja r1 = new C128427ja(2131886176);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, A01(r1, 2131886177), 25);
        C128407jX r7 = new C128407jX(2131886178);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7jY r27 = new AnonymousClass7jY(2131886175);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg(r7, r27, new C128407jX(2131886171), 0), 5);
        C128407jX r72 = new C128407jX(2131886179);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7jY r28 = new AnonymousClass7jY(2131886175);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg(r72, r28, new C128407jX(2131886171), 0), 37);
        C128407jX r73 = new C128407jX(2131886180);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7jY r29 = new AnonymousClass7jY(2131886175);
        AnonymousClass7Kz.A0Q();
        A0D.put(48, new C128487jg(r73, r29, new C128407jX(2131886171), 0));
        SparseArray A002 = AnonymousClass6IJ.A00();
        int size = A002.size();
        for (int i = 0; i < size; i++) {
            C86134wK.A1A(A002, A0D, i);
        }
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128457jd(A0D, R.style.BSCIGTheme), 39);
        AnonymousClass7jY r210 = new AnonymousClass7jY(0);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, r210, new C128407jX(R.style.BSCIGTheme), R.style.BSCIGTheme), 40);
        AnonymousClass7Kz.A0S(A0D, A00(0, R.style.BSCIGTheme), 41);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg((C143568gx) null, new C128397jW(R.style.BSCIGTheme), (C143568gx) null, R.style.BSCIGTheme), 42);
        AnonymousClass7Kz.A0S(A0D, A00(0, R.style.BSCIGTheme), 45);
        AnonymousClass7Kz.A0S(A0D, A00(0, R.style.BSCIGTheme), 46);
        AnonymousClass7Kz.A0Q();
        C128407jX r211 = new C128407jX(R.style.BSCIGTheme);
        AnonymousClass7Kz.A0Q();
        AnonymousClass7Kz.A0S(A0D, new C128487jg(r211, new AnonymousClass7jY(R.style.BSCIGTheme), (C143568gx) null, R.style.BSCIGTheme), 47);
        AnonymousClass7Kz.A0S(A0D, new C128447jc(R.style.BSCIGTheme), 50);
        AnonymousClass7Kz.A0S(A0D, new C128457jd(A0D, R.style.BSCIGTheme), 51);
        A0D.put(55, new C128467je(R.style.BSCIGTheme));
    }

    public static C128487jg A00(int i, int i2) {
        return new C128487jg((C143568gx) null, new AnonymousClass7jY(i), (C143568gx) null, i2);
    }

    public static C128487jg A01(C143568gx r4, int i) {
        return new C128487jg(r4, new AnonymousClass7jY(i), (C143568gx) null, 0);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        bundle.putBoolean("is_display_logged", this.A04);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        M5J m5j;
        C04220Ms.A0B(view, 0);
        AnonymousClass7Kz.A0Q();
        C86114wI.A0z(requireContext(), view, R.color.direct_widget_primary_background);
        this.A02 = new AnonymousClass5AA(A09);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.content_view);
        AnonymousClass5AA r3 = this.A02;
        String str = "itemAdapter";
        if (r3 != null) {
            r3.registerAdapterDataObserver(new IDxDObserverShape52S0100000_2_I2(recyclerView, 1));
            AnonymousClass5AA r0 = this.A02;
            if (r0 != null) {
                recyclerView.setAdapter(r0);
                C18190wL.A1D(recyclerView);
                recyclerView.setOverScrollMode(2);
                recyclerView.A11(new IDxSListenerShape59S0100000_2_I2(this, 0));
                ProgressBar progressBar = (ProgressBar) AnonymousClass0wJ.A0J(view, R.id.progress_bar);
                this.A01 = progressBar;
                if (progressBar == null) {
                    str = "progressBar";
                } else {
                    Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                    if (indeterminateDrawable != null) {
                        AnonymousClass7Kz.A0Q();
                        indeterminateDrawable.setColorFilter(Le4.A00(AnonymousClass006.A05, requireContext().getColor(R.color.default_cta_dominate_color)));
                    }
                    ListSectionViewModel A022 = A02();
                    if (A022 instanceof PayoutDetailsViewModelV2) {
                        m5j = ((PayoutDetailsViewModelV2) A022).A06;
                    } else if (A022 instanceof PayoutDetailsViewModel) {
                        m5j = ((PayoutDetailsViewModel) A022).A05;
                    } else if (A022 instanceof InfoTipViewModel) {
                        m5j = ((InfoTipViewModel) A022).A01;
                    } else {
                        if (A022 instanceof FilterViewModel) {
                            m5j = ((FilterViewModel) A022).A00;
                        } else if (A022 instanceof FeSelectorViewModel) {
                            m5j = ((FeSelectorViewModel) A022).A00;
                        } else if (A022 instanceof TransactionsViewModel) {
                            m5j = ((TransactionsViewModel) A022).A04;
                        } else if (A022 instanceof SettingsViewModel) {
                            m5j = ((SettingsViewModel) A022).A07;
                        } else if (A022 instanceof PayoutsViewModel) {
                            m5j = ((PayoutsViewModel) A022).A00;
                        } else if (A022 instanceof OverviewViewModel) {
                            m5j = ((OverviewViewModel) A022).A05;
                        } else if (A022 instanceof EarningsViewModel) {
                            m5j = ((EarningsViewModel) A022).A00;
                        } else if (A022 instanceof EarningsDetailViewModelV2) {
                            m5j = ((EarningsDetailViewModelV2) A022).A06;
                        } else if (A022 instanceof EarningsDetailViewModel) {
                            m5j = ((EarningsDetailViewModel) A022).A04;
                        } else {
                            m5j = ((AppDialogViewModel) A022).A02;
                        }
                        if (m5j == null) {
                            str = "_dataModelsLiveData";
                        }
                    }
                    C86104wH.A1F(this, m5j, 92);
                    C86104wH.A1F(this, A02().A05, 93);
                    C86104wH.A1F(this, A02().A03, 94);
                    C86104wH.A1F(this, A02().A08, 95);
                    C86104wH.A1F(this, A02().A04, 96);
                    this.A06.A0K(A02().A07, this.A07);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final ListSectionViewModel A02() {
        ListSectionViewModel listSectionViewModel = this.A03;
        if (listSectionViewModel != null) {
            return listSectionViewModel;
        }
        C04220Ms.A0E("viewModel");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r5.mParentFragment == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r5 = this;
            android.os.Bundle r1 = r5.mArguments
            java.lang.String r3 = "Required value was null."
            if (r1 == 0) goto L_0x0098
            java.lang.String r0 = "viewmodel_class"
            int r2 = r1.getInt(r0)
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L_0x0093
            java.lang.String r0 = "has_container_fragment"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x001d
            androidx.fragment.app.Fragment r1 = r5.mParentFragment
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r5.A05 = r0
            X.6uw r1 = X.AnonymousClass7Kz.A06()
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0091
            androidx.fragment.app.Fragment r0 = r5.requireParentFragment()
        L_0x002c:
            X.3ak r1 = r1.A01(r0, r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel"
            X.C04220Ms.A0C(r1, r0)
            com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel r1 = (com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            r5.A03 = r1
            com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel r0 = r5.A02()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x008e
            com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel r1 = r5.A02()
            android.os.Bundle r0 = r5.mArguments
            r1.A07(r0)
            boolean r0 = X.AnonymousClass7Kz.A0U()
            if (r0 == 0) goto L_0x008e
            com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel r0 = r5.A02()
            boolean r0 = r0 instanceof X.C143588gz
            if (r0 == 0) goto L_0x008e
            X.0Oa r4 = r5.A08
            java.lang.Object r3 = r4.getValue()
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel r3 = (com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel) r3
            android.os.Bundle r2 = r5.mArguments
            r0 = 0
            if (r2 == 0) goto L_0x008f
            com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel r0 = r5.A02()
            java.lang.String r1 = r0.A06()
            java.lang.String r0 = "parent_view_name"
            r2.putString(r0, r1)
        L_0x0076:
            r3.A03(r2)
            com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel r1 = r5.A02()
            boolean r0 = r1 instanceof X.C143588gz
            if (r0 == 0) goto L_0x008e
            X.8gz r1 = (X.C143588gz) r1
            if (r1 == 0) goto L_0x008e
            java.lang.Object r0 = r4.getValue()
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel r0 = (com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel) r0
            r1.BQK(r0)
        L_0x008e:
            return
        L_0x008f:
            r2 = r0
            goto L_0x0076
        L_0x0091:
            r0 = r5
            goto L_0x002c
        L_0x0093:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)
            throw r0
        L_0x0098:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56B.A03():void");
    }

    public final /* bridge */ /* synthetic */ M5J BH5() {
        return this.A06;
    }

    public AnonymousClass56B() {
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape25S0100000_I2_5(new KtLambdaShape25S0100000_I2_5(this, 32), 33));
        C02230Ai A0l = C18210wN.A0l(NotificationsViewModel.class);
        this.A08 = C18220wO.A0M(new KtLambdaShape25S0100000_I2_5(A012, 34), C86154wM.A11(A012, this, 24), C86154wM.A11((Object) null, A012, 23), A0l);
    }

    public final boolean onBackPressed() {
        short s;
        int i;
        int i2;
        String str;
        short s2;
        int i3;
        ListSectionViewModel A022 = A02();
        if (A022 instanceof PayoutDetailsViewModelV2) {
            s = 615;
            String str2 = ((PayoutDetailsViewModelV2) A022).A05;
            if (str2 == null) {
                str = "payoutReleaseID";
            } else {
                i = C18210wN.A03(AnonymousClass4n2.A01(str2));
                AnonymousClass7Kz.A06();
                i2 = 667750653;
                AnonymousClass7BK.A00(i2, i, s);
                return false;
            }
        } else {
            if (A022 instanceof TransactionsViewModel) {
                s2 = 615;
                AnonymousClass7Kz.A06();
                i3 = 667758015;
            } else if (A022 instanceof SettingsViewModel) {
                s2 = 615;
                AnonymousClass7Kz.A06();
                i3 = 667749724;
            } else if (A022 instanceof OverviewViewModel) {
                s2 = 615;
                AnonymousClass7Kz.A06();
                i3 = 667754853;
            } else if (!(A022 instanceof EarningsDetailViewModelV2)) {
                return false;
            } else {
                s = 615;
                String str3 = ((EarningsDetailViewModelV2) A022).A05;
                if (str3 == null) {
                    str = "payoutRecordID";
                } else {
                    i = C18210wN.A03(AnonymousClass4n2.A01(str3));
                    AnonymousClass7Kz.A06();
                    i2 = 667750821;
                    AnonymousClass7BK.A00(i2, i, s);
                    return false;
                }
            }
            AnonymousClass7BK.A00(i3, 0, s2);
            return false;
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = C14030oh.A02(-331036352);
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        if (this.A03 == null) {
            if (bundle != null) {
                z = bundle2.getBoolean("is_display_logged");
            } else {
                z = false;
            }
            this.A04 = z;
            A03();
            if (bundle == null) {
                ListSectionViewModel A023 = A02();
                if (A023 instanceof PayoutDetailsViewModelV2) {
                    PayoutDetailsViewModelV2.A03((PayoutDetailsViewModelV2) A023, "client_load_payouthub_init", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 510);
                } else if (A023 instanceof PayoutDetailsViewModel) {
                    PayoutDetailsViewModel.A00((PayoutDetailsViewModel) A023, "client_load_payouthub_init", false);
                } else if (A023 instanceof TransactionsViewModel) {
                    TransactionsViewModel.A03((TransactionsViewModel) A023, (Boolean) null, "client_load_payouthub_init", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 4094);
                } else if (A023 instanceof SettingsViewModel) {
                    SettingsViewModel.A03((SettingsViewModel) A023, "client_load_payouthub_init", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 126);
                } else if (A023 instanceof PayoutsViewModel) {
                    PayoutsViewModel.A00((PayoutsViewModel) A023, "client_load_payouthub_init", (String) null, (String) null);
                } else if (A023 instanceof OverviewViewModel) {
                    OverviewViewModel.A02((OverviewViewModel) A023, "client_load_payouthub_init", (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null, 510);
                } else if (A023 instanceof EarningsViewModel) {
                    EarningsViewModel.A00((EarningsViewModel) A023, "client_load_payouthub_init");
                } else if (A023 instanceof EarningsDetailViewModelV2) {
                    EarningsDetailViewModelV2.A02((EarningsDetailViewModelV2) A023, "client_load_payouthub_init", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 126);
                } else if (A023 instanceof EarningsDetailViewModel) {
                    EarningsDetailViewModel.A00((EarningsDetailViewModel) A023, "client_load_payouthub_init", (String) null, (String) null);
                } else if (A023 instanceof AppDialogViewModel) {
                    AppDialogViewModel.A00((AppDialogViewModel) A023, "client_load_payouthub_init", (String) null, (String) null);
                }
            }
        }
        this.mLifecycleRegistry.A07(A02());
        if (AnonymousClass7Kz.A0U() && (A02() instanceof C143588gz)) {
            this.mLifecycleRegistry.A07((NotificationsViewModel) this.A08.getValue());
        }
        C14030oh.A09(-1883020514, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(2139109854);
        C04220Ms.A0B(layoutInflater, 0);
        FragmentActivity activity = getActivity();
        AnonymousClass7Kz.A0Q();
        View inflate = C86154wM.A0E(activity, layoutInflater, R.style.BSCIGTheme).inflate(R.layout.fragment_list_section, viewGroup, false);
        C14030oh.A09(-210400312, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1729255595);
        super.onDestroyView();
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        C14030oh.A09(-1059330287, A022);
    }
}
