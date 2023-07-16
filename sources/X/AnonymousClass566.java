package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;
import com.facebook.redex.IDxCListenerShape15S1100000_2_I2;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.widget.listcell.ListCell;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.566  reason: invalid class name */
public final class AnonymousClass566 extends Fragment {
    public ContextThemeWrapper A00;
    public TextView A01;
    public PuxTermsConditionItem A02;
    public AnonymousClass58M A03;
    public ListCell A04;
    public ListCell A05;
    public ListCell A06;
    public ListCell A07;

    private final void A00(PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl, ListCell listCell) {
        if (pAYLinkableTextFragmentImpl != null) {
            listCell.setPrimaryText(C86144wL.A0q(pAYLinkableTextFragmentImpl));
            listCell.setOnClickListener(new IDxCListenerShape15S1100000_2_I2((String) C18240wQ.A0b(AnonymousClass3JJ.A00(C18230wP.A0P(pAYLinkableTextFragmentImpl, PAYLinkableTextFragmentImpl.Ranges.class, "ranges"))), this, 1));
            C116836xd.A01(listCell, AnonymousClass006.A01, (String) null);
            return;
        }
        listCell.setVisibility(8);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        this.A03 = C116896xj.A01(this, (ECPPaymentRequest) null);
        if (getActivity() != null) {
            ViewGroup A0J = C18220wO.A0J(view, R.id.terms_scroll_view);
            if (AnonymousClass69R.A0F.A07) {
                AnonymousClass7IS r0 = AnonymousClass6XN.A00;
                C04220Ms.A04(A0J);
                r0.A04(A0J);
            }
            TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.sheet_body_text);
            AnonymousClass7Fd.A02(textView, AnonymousClass69Q.PRIMARY_TEXT_DEEMPHASIZED);
            AnonymousClass7Fe.A01(textView, 2131886573);
            this.A01 = textView;
            ListCell listCell = (ListCell) AnonymousClass0wJ.A0J(view, R.id.terms_link);
            A01(listCell);
            this.A07 = listCell;
            ListCell listCell2 = (ListCell) AnonymousClass0wJ.A0J(view, R.id.policy_link);
            A01(listCell2);
            this.A05 = listCell2;
            ListCell listCell3 = (ListCell) AnonymousClass0wJ.A0J(view, R.id.support_link);
            A01(listCell3);
            this.A06 = listCell3;
            ListCell listCell4 = (ListCell) AnonymousClass0wJ.A0J(view, R.id.additional_link);
            A01(listCell4);
            this.A04 = listCell4;
        }
    }

    public static final void A01(ListCell listCell) {
        listCell.setPrimaryTextStyle(AnonymousClass69Q.PRIMARY_TEXT);
        AnonymousClass51G r1 = new AnonymousClass51G(C18190wL.A0A(listCell));
        r1.setIcon(AnonymousClass697.SECONDARY_CHEVRON_RIGHT_OUTLINE_LARGE);
        listCell.setRightAddOnIcon(r1);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(419946044);
        Context A0A = C18240wQ.A0A(this, layoutInflater, 0);
        AnonymousClass7Kz.A0G();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(A0A, R.style.FBPayUIWidget);
        this.A00 = contextThemeWrapper;
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.ecp_terms_condition_content_fragment, viewGroup, false);
        C14030oh.A09(365068557, A022);
        return inflate;
    }

    public final void onResume() {
        PuxTermsConditionItem puxTermsConditionItem;
        PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl;
        int A022 = C14030oh.A02(-1225017767);
        super.onResume();
        AnonymousClass58M r0 = this.A03;
        if (r0 == null) {
            C04220Ms.A0E("ecpViewModel");
            throw null;
        }
        AnonymousClass7Kx A0R = C86104wH.A0R(r0.A0y);
        if (A0R == null || (puxTermsConditionItem = (PuxTermsConditionItem) A0R.A01) == null || A0R.A00 == AnonymousClass67Q.ERROR) {
            puxTermsConditionItem = new PuxTermsConditionItem((PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, AnonymousClass69U.A0f, (String) null, (String) null, (List) null, (List) null);
        }
        this.A02 = puxTermsConditionItem;
        String str = puxTermsConditionItem.A05;
        if (str != null) {
            ContextThemeWrapper contextThemeWrapper = this.A00;
            if (contextThemeWrapper == null) {
                C04220Ms.A0E("viewContext");
                throw null;
            }
            AnonymousClass3JK.A00(contextThemeWrapper, this, AnonymousClass69R.A0F, str, (String) null, (AnonymousClass0ZU) null, (AnonymousClass0ZU) null, 472, false);
        }
        PuxTermsConditionItem puxTermsConditionItem2 = this.A02;
        PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl2 = null;
        if (puxTermsConditionItem2 == null) {
            C04220Ms.A0E("termsCondition");
            throw null;
        }
        List list = puxTermsConditionItem2.A06;
        if (list != null) {
            TextView textView = this.A01;
            if (textView == null) {
                C04220Ms.A0E("sheetBodyTextView");
                throw null;
            }
            textView.setText(AnonymousClass00J.A0H("\n\n", (CharSequence) null, (CharSequence) null, list, (AnonymousClass0YY) null, 62));
        }
        ListCell listCell = this.A07;
        if (listCell == null) {
            C04220Ms.A0E("termsListCell");
            throw null;
        }
        PuxTermsConditionItem puxTermsConditionItem3 = this.A02;
        if (puxTermsConditionItem3 == null) {
            C04220Ms.A0E("termsCondition");
            throw null;
        }
        A00(puxTermsConditionItem3.A02, listCell);
        ListCell listCell2 = this.A05;
        if (listCell2 == null) {
            C04220Ms.A0E("policyListCell");
            throw null;
        }
        PuxTermsConditionItem puxTermsConditionItem4 = this.A02;
        if (puxTermsConditionItem4 == null) {
            C04220Ms.A0E("termsCondition");
            throw null;
        }
        A00(puxTermsConditionItem4.A03, listCell2);
        ListCell listCell3 = this.A06;
        if (listCell3 == null) {
            C04220Ms.A0E("supportListCell");
            throw null;
        }
        PuxTermsConditionItem puxTermsConditionItem5 = this.A02;
        if (puxTermsConditionItem5 == null) {
            C04220Ms.A0E("termsCondition");
            throw null;
        }
        List list2 = puxTermsConditionItem5.A07;
        if (list2 != null) {
            pAYLinkableTextFragmentImpl = (PAYLinkableTextFragmentImpl) C18240wQ.A0b(list2);
        } else {
            pAYLinkableTextFragmentImpl = null;
        }
        A00(pAYLinkableTextFragmentImpl, listCell3);
        ListCell listCell4 = this.A04;
        if (listCell4 == null) {
            C04220Ms.A0E("additionalListCell");
            throw null;
        }
        PuxTermsConditionItem puxTermsConditionItem6 = this.A02;
        if (puxTermsConditionItem6 == null) {
            C04220Ms.A0E("termsCondition");
            throw null;
        }
        List list3 = puxTermsConditionItem6.A07;
        if (list3 != null) {
            pAYLinkableTextFragmentImpl2 = (PAYLinkableTextFragmentImpl) C86134wK.A0k(list3);
        }
        A00(pAYLinkableTextFragmentImpl2, listCell4);
        C14030oh.A09(1768747827, A022);
    }
}
