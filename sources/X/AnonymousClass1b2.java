package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.dextricks.DexStore;
import com.instagram.barcelona.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.PrimerBottomSheetConfig;

/* renamed from: X.1b2  reason: invalid class name */
public final class AnonymousClass1b2 extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "PrimerBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public PrimerBottomSheetConfig A03;
    public CharSequence A04;
    public final C04530Oa A05 = C80644m9.A00(this);

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public final boolean onBackPressed() {
        PrimerBottomSheetConfig primerBottomSheetConfig = this.A03;
        if (primerBottomSheetConfig == null) {
            C04220Ms.A0E(DexStore.CONFIG_FILENAME);
            throw null;
        } else if (primerBottomSheetConfig.A06) {
            return false;
        } else {
            return isVisible();
        }
    }

    public final String getModuleName() {
        PrimerBottomSheetConfig primerBottomSheetConfig = (PrimerBottomSheetConfig) requireArguments().getParcelable("arg_config");
        if (primerBottomSheetConfig != null) {
            return primerBottomSheetConfig.A02;
        }
        return __redex_internal_original_name;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1225709233);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("arg_config");
        C04220Ms.A0A(parcelable);
        this.A03 = (PrimerBottomSheetConfig) parcelable;
        C14030oh.A09(1628438356, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022;
        int A023 = C14030oh.A02(1307353795);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.primer_bottom_sheet, viewGroup, false);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0J(inflate, R.id.headline);
        Context requireContext = requireContext();
        PrimerBottomSheetConfig primerBottomSheetConfig = this.A03;
        if (primerBottomSheetConfig != null) {
            Drawable drawable = requireContext.getDrawable(primerBottomSheetConfig.A01.A00);
            if (drawable != null) {
                PrimerBottomSheetConfig primerBottomSheetConfig2 = this.A03;
                if (primerBottomSheetConfig2 != null) {
                    ColorTint colorTint = primerBottomSheetConfig2.A01.A01;
                    if (colorTint != null && colorTint.A02 == 0) {
                        drawable = C19587Ayn.A05(requireContext, drawable, requireContext.getColor(colorTint.A01), requireContext.getColor(colorTint.A00));
                    }
                    igdsHeadline.setImageDrawable(drawable);
                    PrimerBottomSheetConfig primerBottomSheetConfig3 = this.A03;
                    if (primerBottomSheetConfig3 != null) {
                        igdsHeadline.setHeadline(primerBottomSheetConfig3.A00);
                        RecyclerView recyclerView = (RecyclerView) inflate.requireViewById(R.id.info_list);
                        PrimerBottomSheetConfig primerBottomSheetConfig4 = this.A03;
                        if (primerBottomSheetConfig4 != null) {
                            recyclerView.setAdapter(new AnonymousClass119(primerBottomSheetConfig4.A05));
                            TextView textView = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.primary_action);
                            PrimerBottomSheetConfig primerBottomSheetConfig5 = this.A03;
                            if (primerBottomSheetConfig5 != null) {
                                textView.setText(primerBottomSheetConfig5.A03);
                                textView.setOnClickListener(this.A01);
                                IgdsButton igdsButton = (IgdsButton) AnonymousClass0wJ.A0J(inflate, R.id.secondary_action_v2);
                                PrimerBottomSheetConfig primerBottomSheetConfig6 = this.A03;
                                if (primerBottomSheetConfig6 != null) {
                                    igdsButton.setText(primerBottomSheetConfig6.A04);
                                    igdsButton.setOnClickListener(this.A02);
                                    TextView textView2 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.secondary_action_v1);
                                    PrimerBottomSheetConfig primerBottomSheetConfig7 = this.A03;
                                    if (primerBottomSheetConfig7 != null) {
                                        textView2.setText(primerBottomSheetConfig7.A04);
                                        textView2.setOnClickListener(this.A02);
                                        PrimerBottomSheetConfig primerBottomSheetConfig8 = this.A03;
                                        if (primerBottomSheetConfig8 != null) {
                                            if (primerBottomSheetConfig8.A08) {
                                                textView2.setVisibility(8);
                                                igdsButton.setVisibility(0);
                                            } else {
                                                textView2.setVisibility(0);
                                                igdsButton.setVisibility(8);
                                            }
                                            PrimerBottomSheetConfig primerBottomSheetConfig9 = this.A03;
                                            if (primerBottomSheetConfig9 != null) {
                                                boolean z = primerBottomSheetConfig9.A07;
                                                int i = R.id.footer_text;
                                                if (z) {
                                                    i = R.id.bottommost_footer_text;
                                                }
                                                TextView A0L = AnonymousClass0wJ.A0L(inflate, i);
                                                C04220Ms.A09(A0L);
                                                if (this.A04 != null) {
                                                    A0L.setVisibility(0);
                                                    A0L.setMovementMethod(C28241F2t.A00);
                                                    A0L.setClickable(AnonymousClass0wJ.A1W(this.A00));
                                                    boolean isClickable = A0L.isClickable();
                                                    Context requireContext2 = requireContext();
                                                    if (isClickable) {
                                                        A022 = R.color.igds_link;
                                                    } else {
                                                        A022 = C121907Is.A02(requireContext2, R.attr.igdsSecondaryText);
                                                    }
                                                    C18180wK.A0s(requireContext2, A0L, A022);
                                                    A0L.setOnClickListener(this.A00);
                                                    A0L.setLongClickable(false);
                                                    A0L.setText(this.A04);
                                                }
                                                C14030oh.A09(1928993386, A023);
                                                return inflate;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        C04220Ms.A0E(DexStore.CONFIG_FILENAME);
        throw null;
    }
}
