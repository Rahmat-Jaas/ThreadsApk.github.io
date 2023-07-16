package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.7jT  reason: invalid class name and case insensitive filesystem */
public abstract class C128377jT implements AnonymousClass8e8 {
    public final C110626m0 A00;

    public final void A02(M5O m5o) {
        Drawable drawable;
        Drawable newDrawable;
        C04220Ms.A0B(m5o, 0);
        C110626m0 r3 = this.A00;
        AnonymousClass7E5 r2 = r3.A02;
        if (r2 != null) {
            m5o.itemView.setFocusable(true);
            View view = m5o.itemView;
            C04220Ms.A05(view);
            r2.A02(view);
        }
        int i = r3.A00;
        if (i != 0) {
            m5o.itemView.setId(i);
        }
        if (this instanceof C92435iS) {
            if (m5o instanceof C92545ig) {
                ProgressBar progressBar = ((C92545ig) m5o).A00;
                Drawable.ConstantState constantState = progressBar.getIndeterminateDrawable().getConstantState();
                if (constantState == null || (newDrawable = constantState.newDrawable()) == null) {
                    drawable = null;
                } else {
                    drawable = newDrawable.mutate();
                    if (drawable != null) {
                        AnonymousClass7Kz.A0Q();
                        drawable.setColorFilter(Le4.A00(AnonymousClass006.A05, C18190wL.A0A(progressBar).getColor(R.color.default_cta_dominate_color)));
                    }
                }
                progressBar.setIndeterminateDrawable(drawable);
            } else {
                throw C86104wH.A12(this);
            }
        } else if (this instanceof C92465iX) {
            C92465iX r22 = (C92465iX) this;
            if (m5o instanceof C92575ij) {
                AnonymousClass5iR r4 = r22.A00;
                C146998nD r1 = r4.A01;
                if (r1 != null) {
                    View view2 = m5o.itemView;
                    C04220Ms.A05(view2);
                    r1.Chv(view2);
                }
                C128387jU r12 = r4.A04;
                if (r12 != null) {
                    r12.A04(((C92575ij) m5o).A00);
                }
                C128387jU r13 = r4.A05;
                if (r13 != null) {
                    r13.A04(((C92575ij) m5o).A01);
                }
                C128387jU r14 = r4.A06;
                if (r14 != null) {
                    r14.A04(((C92575ij) m5o).A02);
                }
                View.OnClickListener onClickListener = r4.A03;
                if (onClickListener != null) {
                    m5o.itemView.setOnClickListener(onClickListener);
                }
                C92575ij r9 = (C92575ij) m5o;
                C92465iX.A00(r9.A03, r4.A00, r4.A01);
                C92465iX.A00(r9.A04, 1.0f, r4.A02);
            } else {
                throw C86104wH.A12(r22);
            }
        } else if (this instanceof C92445iV) {
            if (m5o instanceof C92535if) {
                C92535if r92 = (C92535if) m5o;
                View view3 = r92.A00;
                AnonymousClass7Kz.A0Q();
                C86114wI.A0z(C18190wL.A0A(r92.itemView), view3, R.color.igds_separator);
            } else {
                throw C86104wH.A12(this);
            }
        } else if (this instanceof AnonymousClass5iU) {
            AnonymousClass5iU r23 = (AnonymousClass5iU) this;
            if (m5o instanceof C92555ih) {
                C92555ih r7 = (C92555ih) m5o;
                ViewGroup viewGroup = r7.A01;
                viewGroup.removeAllViews();
                List list = r7.A02;
                list.clear();
                AnonymousClass5iN r24 = r23.A00;
                View view4 = m5o.itemView;
                C04220Ms.A05(view4);
                C146998nD r0 = r24.A01;
                if (r0 != null) {
                    r0.Chv(view4);
                }
                for (C128377jT r25 : r24.A00) {
                    C89105Bx Bsh = ((C143578gy) r7.A00.get(r25.A00.A05)).Bsh(viewGroup);
                    list.add(Bsh);
                    viewGroup.addView(Bsh.itemView);
                    r25.A02(Bsh);
                }
            } else {
                throw C86104wH.A12(r23);
            }
        } else {
            AnonymousClass5iT r26 = (AnonymousClass5iT) this;
            if (m5o instanceof C92565ii) {
                View view5 = m5o.itemView;
                C04220Ms.A05(view5);
                AnonymousClass5iO r27 = r26.A00;
                r27.A00.Chv(view5);
                m5o.itemView.setElevation(1.0f);
                C128387jU r15 = r27.A02;
                if (r15 != null) {
                    r15.A04(((C92565ii) m5o).A01);
                }
                C128387jU r16 = r27.A01;
                if (r16 != null) {
                    r16.A04(((C92565ii) m5o).A00);
                }
            } else {
                throw C86104wH.A12(r26);
            }
        }
        r3.A04.invoke();
    }

    public boolean A03(C128377jT r5) {
        C146998nD r1;
        C146998nD r0;
        if (r5 != null) {
            C110626m0 r3 = this.A00;
            int i = r3.A00;
            C110626m0 r2 = r5.A00;
            if (i == r2.A00 && r3.A05 == r2.A05 && C04220Ms.A0I(r3.A03, r2.A03)) {
                if (r3 instanceof AnonymousClass5iO) {
                    r1 = ((AnonymousClass5iO) r3).A00;
                } else {
                    r1 = r3.A01;
                }
                if (r2 instanceof AnonymousClass5iO) {
                    r0 = ((AnonymousClass5iO) r2).A00;
                } else {
                    r0 = r2.A01;
                }
                if (!C04220Ms.A0I(r1, r0) || !C04220Ms.A0I(r3.A04, r2.A04)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C128377jT(C110626m0 r1) {
        this.A00 = r1;
    }
}
