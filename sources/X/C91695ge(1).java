package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.graphql.impls.CardVerificationFieldsImpl;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.widget.actionmenu.InlineActionMenu;
import com.facebookpay.widget.listcell.ListCell;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;

/* renamed from: X.5ge  reason: invalid class name and case insensitive filesystem */
public final class C91695ge extends C886359v {
    public final Context A00;
    public final AnonymousClass066 A01;
    public final AnonymousClass0YY A02;
    public final AnonymousClass0YY A03;
    public final AnonymousClass0YP A04;
    public final AnonymousClass0YC A05;

    public C91695ge(Context context, AnonymousClass066 r4, LoggingContext loggingContext, AnonymousClass0YY r6, AnonymousClass0YY r7, AnonymousClass0YP r8, AnonymousClass0YC r9) {
        super(AnonymousClass69U.A05, loggingContext, false);
        this.A03 = r6;
        this.A02 = r7;
        this.A04 = r8;
        this.A05 = r9;
        this.A00 = context;
        this.A01 = r4;
    }

    public static final void A06(C91755gk r2) {
        ListCell listCell = r2.A01;
        listCell.setOnClickListener((View.OnClickListener) null);
        listCell.setPrimaryText((String) null);
        listCell.setSecondaryText((String) null);
        listCell.setTertiaryText((String) null);
        listCell.setErrorText((String) null);
        C86154wM.A1H(listCell.A04);
        listCell.setActionMenu((FrameLayout) null);
        listCell.setImageUrl((String) null);
        listCell.A08(AnonymousClass006.A0Y);
        Integer num = AnonymousClass006.A00;
        listCell.A09(num);
        listCell.A0A(num);
    }

    public static final void A07(C91755gk r16, C91695ge r17, AnonymousClass7Kx r18) {
        String str;
        String str2;
        C148488rA r0;
        String str3;
        String str4;
        String str5;
        String A0L;
        C91755gk r5 = r16;
        ListCell listCell = r5.A01;
        listCell.A03();
        AnonymousClass7Kx r4 = r18;
        Object obj = r4.A01;
        if (obj != null) {
            SelectionPaymentMethodItem selectionPaymentMethodItem = (SelectionPaymentMethodItem) obj;
            Context context = listCell.getContext();
            boolean z = true;
            boolean A1Z = C18180wK.A1Z(selectionPaymentMethodItem.A08, C40307LcE.A06);
            boolean z2 = selectionPaymentMethodItem.A0I;
            if (!z2 || !AnonymousClass7Kz.A0J().A04() || (str4 = selectionPaymentMethodItem.A0F) == null || AnonymousClass8bQ.A0n(str4) || (str5 = selectionPaymentMethodItem.A0G) == null || AnonymousClass8bQ.A0n(str5)) {
                listCell.setImageUrl(selectionPaymentMethodItem.A0C);
                AnonymousClass67L r13 = selectionPaymentMethodItem.A01;
                if (r13 != null) {
                    str = C86104wH.A11(AnonymousClass0wJ.A0k(context, 2131826383), AnonymousClass7Kz.A0O(), new Object[]{selectionPaymentMethodItem.A05, C116946xs.A01(context, r13)}, 2);
                } else {
                    str = selectionPaymentMethodItem.A05;
                }
            } else {
                listCell.A0B(str4);
                AnonymousClass67L r02 = selectionPaymentMethodItem.A01;
                if (r02 != null) {
                    C04220Ms.A06(context);
                    String A012 = C116946xs.A01(context, r02);
                    if (A012 != null && AnonymousClass8bQ.A0m(A012)) {
                        A0L = C86104wH.A11(AnonymousClass0wJ.A0k(context, 2131826383), AnonymousClass7Kz.A0O(), new Object[]{AnonymousClass00U.A0L(" •••• ", selectionPaymentMethodItem.A0H), A012}, 2);
                        str = AnonymousClass00U.A0L(str5, A0L);
                    }
                }
                A0L = AnonymousClass00U.A0L(" •••• ", selectionPaymentMethodItem.A0H);
                str = AnonymousClass00U.A0L(str5, A0L);
            }
            listCell.setPrimaryText(str);
            if (AnonymousClass7Kz.A0J().A04() && z2) {
                listCell.A06(15, 2131886528);
            }
            CardVerificationFieldsImpl cardVerificationFieldsImpl = selectionPaymentMethodItem.A00;
            if (cardVerificationFieldsImpl == null || (str2 = cardVerificationFieldsImpl.getStringValue("error_msg")) == null) {
                Integer num = selectionPaymentMethodItem.A02;
                if (num != null) {
                    str2 = context.getString(num.intValue());
                } else {
                    str2 = null;
                }
            }
            listCell.setErrorText(str2);
            if (A1Z) {
                InlineActionMenu inlineActionMenu = r5.A00;
                TextView textView = inlineActionMenu.A02;
                if (textView == null) {
                    str3 = "removeView";
                } else {
                    textView.setVisibility(0);
                    TextView textView2 = inlineActionMenu.A01;
                    if (textView2 == null) {
                        str3 = "editView";
                    } else {
                        textView2.setVisibility(8);
                        TextView textView3 = inlineActionMenu.A00;
                        if (textView3 == null) {
                            str3 = "dividerView";
                        } else {
                            textView3.setVisibility(8);
                            listCell.setSecondaryText(selectionPaymentMethodItem.A04);
                        }
                    }
                }
                C04220Ms.A0E(str3);
                throw null;
            } else if (selectionPaymentMethodItem.A03 != AnonymousClass006.A0C || (r0 = selectionPaymentMethodItem.A07) == null) {
                listCell.setSecondaryTextLineBreaks(false);
                listCell.setSecondaryText((String) null);
                listCell.setTertiaryText((String) null);
            } else {
                listCell.setSecondaryTextLineBreaks(true);
                listCell.setSecondaryText(AnonymousClass7H2.A01(r0));
                listCell.setTertiaryText(selectionPaymentMethodItem.A04);
            }
            AnonymousClass51D r2 = r5.A02;
            if (selectionPaymentMethodItem.A03 != AnonymousClass006.A0C) {
                z = false;
            }
            r2.setChecked(z);
            listCell.setLeftAddOnView(r2);
            FrameLayout frameLayout = listCell.A04;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            InlineActionMenu inlineActionMenu2 = r5.A00;
            listCell.setActionMenu(inlineActionMenu2);
            ImageView imageView = listCell.A08;
            if (imageView == null) {
                C04220Ms.A0E("imageView");
                throw null;
            }
            C39909L6z A0J = C86134wK.A0J(imageView);
            A0J.A0s = 0;
            A0J.A0E = R.id.error_text;
            listCell.A02();
            AnonymousClass7H2.A02(selectionPaymentMethodItem, listCell, (String) null, (String) null);
            inlineActionMenu2.setEditAccessibility(AnonymousClass0wJ.A0k(context, 2131826464));
            inlineActionMenu2.setRemoveAccessibility(AnonymousClass0wJ.A0k(context, 2131826618));
            C86144wL.A1C(listCell, r17, r4, r5, 5);
            return;
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
