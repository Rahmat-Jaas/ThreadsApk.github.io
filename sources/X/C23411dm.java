package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.CrosspostUpsellSettingsFragment;
import com.instagram.debug.devoptions.disk.DiskUtils;
import com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Locale;
import kotlin.jvm.internal.KtLambdaShape62S0100000_I2_42;

/* renamed from: X.1dm  reason: invalid class name and case insensitive filesystem */
public abstract class C23411dm extends C22302CTd {
    public static final String __redex_internal_original_name = "IgMenuFragment";
    public C10300i6 mSession;

    public static void A08(C24471ir r1) {
        r1.A02 = true;
        r1.A0D.A0C();
    }

    public boolean isElevated() {
        return false;
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, AbstractCollection abstractCollection) {
        abstractCollection.add(new C63293hC(spannableStringBuilder));
    }

    public static void A02(View.OnClickListener onClickListener, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C62593aM(onClickListener, i));
    }

    public static void A03(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CharSequence charSequence, CharSequence charSequence2, AbstractCollection abstractCollection, boolean z) {
        abstractCollection.add(new AnonymousClass4MC(onCheckedChangeListener, charSequence, charSequence2, z));
    }

    public static void A04(Fragment fragment, AnonymousClass4u2 r17, int i) {
        AnonymousClass4u2 r3 = r17;
        r3.Cqb(i);
        r3.CtT(true);
        r3.Cro(new C24758DYo(C63393hP.A00(fragment.getContext().getColor(R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color)), (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass006.A00, -2, -2, -2, -2, -2, -2, -2, true));
    }

    public static void A05(Fragment fragment, AnonymousClass4u2 r17, int i) {
        AnonymousClass4u2 r3 = r17;
        r3.Cqb(i);
        r3.CtT(true);
        r3.Cro(new C24758DYo(C63393hP.A00(fragment.requireContext().getColor(R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color)), (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass006.A00, -2, -2, -2, -2, -2, -2, -2, true));
    }

    public static void A06(C25786Drz drz) {
        C111986om.A01.A00();
        drz.A03 = new C29201xU();
        drz.A05();
    }

    public static void A07(C29161xC r1, AbstractCollection abstractCollection, int i, int i2) {
        C63293hC r12 = new C63293hC(C29161xC.A0B(r1, new KtLambdaShape62S0100000_I2_42(r1, i), i2));
        r12.A00 = R.style.PrivacyTextStyle;
        abstractCollection.add(r12);
    }

    public static boolean A0A(QuickExperimentCategoriesFragment.AnonymousClass1 r1, String str) {
        return str.contains(QuickExperimentCategoriesFragment.this.mSearchQuery.toLowerCase(Locale.getDefault()));
    }

    public static AnonymousClass3ZL A00(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        return AnonymousClass3Zu.A03(AnonymousClass0wJ.A0X(crosspostUpsellSettingsFragment.userSession$delegate));
    }

    public static void A09(C62153Xk r1, AbstractCollection abstractCollection, long j) {
        r1.A04 = DiskUtils.formatSize(j);
        abstractCollection.add(r1);
    }

    public int getBottomPadding() {
        return C18220wO.A03(AnonymousClass0wJ.A0B(this));
    }

    public int getItemPosition(Object obj) {
        return ((AnonymousClass1fC) getAdapter()).mObjects.indexOf(obj);
    }

    public int getTopPadding() {
        return C18220wO.A03(AnonymousClass0wJ.A0B(this));
    }

    public Boolean getUseRecyclerViewFromQE() {
        return C18180wK.A0Y();
    }

    public void notifyItemChanged(int i) {
        ((C41030Luu) getAdapter()).notifyItemChanged(i);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-160817365);
        super.onCreate(bundle);
        this.mSession = C18190wL.A0S(requireArguments());
        setAdapter(new AnonymousClass1fC(requireContext(), this.mSession, this));
        C14030oh.A09(-221509986, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(902052602);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.layout_recyclerview);
        if (isElevated()) {
            A0H.setBackgroundResource(R.color.igds_elevated_background);
        }
        C14030oh.A09(-74569936, A02);
        return A0H;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C18200wM.A0H(this).setPadding(0, getTopPadding(), 0, getBottomPadding());
        C18200wM.A0H(this).setClipToPadding(false);
        FragmentActivity activity = getActivity();
        if (activity instanceof C82044oz) {
            getScrollingViewProxy().A7b(new C161629e7((C82044oz) activity, 0));
        }
    }

    public void scrollToPosition(int i) {
        getScrollingViewProxy().CuM(i);
    }

    public void setBottomSheetMenuItems(Collection collection) {
        ((AnonymousClass1fC) getAdapter()).setBottomSheetMenuItems(collection);
    }

    public void setItems(Collection collection) {
        ((AnonymousClass1fC) getAdapter()).setItems(collection);
    }

    public void onRecyclerViewCreated(RecyclerView recyclerView) {
        C18190wL.A1D(recyclerView);
    }
}
