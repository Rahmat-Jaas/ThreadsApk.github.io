package com.instagram.share.facebook.widget;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C09860go;
import X.C11630kW;
import X.C121907Is;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C29934Fwk;
import X.C63393hP;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public class FindPeopleButton extends LinearLayout {
    public int A00;
    public ImageView A01;
    public ImageView A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public CircularImageView A07;
    public GradientSpinnerAvatarView A08;
    public String A09;
    public String A0A;
    public String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FindPeopleButton(Context context) {
        super(context);
        C04220Ms.A0B(context, 1);
        A01(context, (AttributeSet) null);
    }

    public final void setActionButtonOnClickListener(View.OnClickListener onClickListener) {
        C04220Ms.A0B(onClickListener, 0);
        LinearLayout linearLayout = this.A03;
        if (linearLayout == null) {
            C04220Ms.A0E("container");
            throw null;
        } else {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    public final void setDismissButtonOnClickListener(View.OnClickListener onClickListener) {
        C04220Ms.A0B(onClickListener, 0);
        ImageView imageView = this.A02;
        if (imageView == null) {
            C04220Ms.A0E("dismissButton");
            throw null;
        } else {
            imageView.setOnClickListener(onClickListener);
        }
    }

    private final void A00() {
        String str;
        LinearLayout linearLayout = this.A03;
        if (linearLayout == null) {
            str = "container";
        } else {
            String str2 = this.A0B;
            if (str2 == null) {
                str = "defaultTitle";
            } else {
                String str3 = this.A0A;
                if (str3 == null) {
                    str = "defaultSubtitle";
                } else {
                    linearLayout.setContentDescription(AnonymousClass00U.A0V(str2, ", ", str3));
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void setChevronButtonVisibility(int i) {
        ImageView imageView = this.A01;
        if (imageView == null) {
            C04220Ms.A0E("chevronButton");
            throw null;
        } else {
            imageView.setVisibility(i);
        }
    }

    public final void setDismissButtonEnabled(boolean z) {
        ImageView imageView = this.A02;
        if (imageView == null) {
            C04220Ms.A0E("dismissButton");
            throw null;
        } else {
            imageView.setVisibility(C18190wL.A00(z ? 1 : 0));
        }
    }

    public final void setIcon(int i) {
        CircularImageView circularImageView = this.A07;
        if (circularImageView == null) {
            C04220Ms.A0E("icon");
            throw null;
        } else {
            C18180wK.A0r(getContext(), circularImageView, i);
        }
    }

    private final void A01(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        View inflate = C18180wK.A0C(this).inflate(R.layout.layout_find_people_button, this);
        this.A03 = (LinearLayout) AnonymousClass0wJ.A0J(inflate, R.id.layout_container_main);
        this.A07 = (CircularImageView) AnonymousClass0wJ.A0J(inflate, R.id.find_people_imageview);
        this.A08 = (GradientSpinnerAvatarView) AnonymousClass0wJ.A0J(inflate, R.id.find_people_avatarview);
        this.A06 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.find_people_title);
        this.A05 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.find_people_subtitle);
        this.A04 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.find_people_action_button);
        this.A02 = (ImageView) AnonymousClass0wJ.A0J(inflate, R.id.find_people_dismiss_button);
        this.A01 = (ImageView) AnonymousClass0wJ.A0J(inflate, R.id.find_people_chevron_button);
        this.A0B = "";
        this.A0A = "";
        this.A09 = "";
        String str = "actionButton";
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A0j);
            C04220Ms.A06(obtainStyledAttributes);
            if (obtainStyledAttributes.hasValue(3)) {
                CircularImageView circularImageView = this.A07;
                if (circularImageView != null) {
                    circularImageView.setImageDrawable(obtainStyledAttributes.getDrawable(3));
                }
                C04220Ms.A0E("icon");
                throw null;
            }
            this.A00 = obtainStyledAttributes.getColor(4, C121907Is.A00(context, R.attr.glyphColorPrimary));
            int color = obtainStyledAttributes.getColor(6, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            CircularImageView circularImageView2 = this.A07;
            if (circularImageView2 != null) {
                circularImageView2.A0F(dimensionPixelSize, color);
                if (obtainStyledAttributes.hasValue(2) && (resourceId2 = obtainStyledAttributes.getResourceId(2, 0)) != 0) {
                    this.A0B = AnonymousClass0wJ.A0k(context, resourceId2);
                }
                if (obtainStyledAttributes.hasValue(1) && (resourceId = obtainStyledAttributes.getResourceId(1, 0)) != 0) {
                    this.A0A = AnonymousClass0wJ.A0k(context, resourceId);
                }
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId3 = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId3 != 0) {
                        this.A09 = AnonymousClass0wJ.A0k(context, resourceId3);
                    }
                } else {
                    TextView textView = this.A04;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    C04220Ms.A0E(str);
                    throw null;
                }
                if (obtainStyledAttributes.hasValue(5)) {
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
                    CircularImageView circularImageView3 = this.A07;
                    if (circularImageView3 != null) {
                        circularImageView3.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                    }
                }
                obtainStyledAttributes.recycle();
            }
            C04220Ms.A0E("icon");
            throw null;
        }
        int A022 = C18210wN.A02(context);
        TextView textView2 = this.A04;
        if (textView2 != null) {
            C09860go.A0a(textView2, A022, A022);
            LinearLayout linearLayout = this.A03;
            if (linearLayout == null) {
                str = "container";
            } else {
                C18210wN.A0y(linearLayout);
                A00();
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        TextView textView = this.A06;
        if (textView != null) {
            Context context = getContext();
            C18180wK.A0s(context, textView, R.color.igds_primary_text);
            TextView textView2 = this.A06;
            if (textView2 != null) {
                textView2.getPaint().setFakeBoldText(true);
                TextView textView3 = this.A05;
                String str = "subtitle";
                if (textView3 != null) {
                    C18180wK.A0s(context, textView3, R.color.igds_secondary_text);
                    TextView textView4 = this.A06;
                    if (textView4 != null) {
                        String str2 = this.A0B;
                        if (str2 == null) {
                            str = "defaultTitle";
                        } else {
                            textView4.setText(str2);
                            TextView textView5 = this.A05;
                            if (textView5 != null) {
                                String str3 = this.A0A;
                                if (str3 == null) {
                                    str = "defaultSubtitle";
                                } else {
                                    textView5.setText(str3);
                                    TextView textView6 = this.A04;
                                    if (textView6 == null) {
                                        str = "actionButton";
                                    } else {
                                        String str4 = this.A09;
                                        if (str4 == null) {
                                            str = "defaultActionText";
                                        } else {
                                            textView6.setText(str4);
                                            CircularImageView circularImageView = this.A07;
                                            str = "icon";
                                            if (circularImageView != null) {
                                                if (circularImageView.getDrawable() != null) {
                                                    CircularImageView circularImageView2 = this.A07;
                                                    if (circularImageView2 != null) {
                                                        C63393hP.A05(circularImageView2.getDrawable().mutate(), this.A00);
                                                        return;
                                                    }
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C04220Ms.A0E(str);
                throw null;
            }
        }
        C04220Ms.A0E(DialogModule.KEY_TITLE);
        throw null;
    }

    public final void setAvatar(ImageUrl imageUrl, C11630kW r6) {
        String str;
        boolean A1Y = AnonymousClass0wJ.A1Y(imageUrl, r6);
        CircularImageView circularImageView = this.A07;
        if (circularImageView == null) {
            str = "icon";
        } else {
            circularImageView.setVisibility(8);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A08;
            str = "avatar";
            if (gradientSpinnerAvatarView != null) {
                gradientSpinnerAvatarView.A09(imageUrl, r6);
                GradientSpinnerAvatarView gradientSpinnerAvatarView2 = this.A08;
                if (gradientSpinnerAvatarView2 != null) {
                    gradientSpinnerAvatarView2.A05();
                    GradientSpinnerAvatarView gradientSpinnerAvatarView3 = this.A08;
                    if (gradientSpinnerAvatarView3 != null) {
                        gradientSpinnerAvatarView3.setVisibility(A1Y ? 1 : 0);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void setButtonText(int i) {
        this.A09 = AnonymousClass0wJ.A0k(getContext(), i);
        TextView textView = this.A04;
        if (textView != null) {
            textView.setText(i);
            TextView textView2 = this.A04;
            if (textView2 != null) {
                textView2.setVisibility(0);
                A00();
                return;
            }
        }
        C04220Ms.A0E("actionButton");
        throw null;
    }

    public final void setSubtitle(int i) {
        this.A0A = AnonymousClass0wJ.A0k(getContext(), i);
        TextView textView = this.A05;
        if (textView == null) {
            C04220Ms.A0E("subtitle");
            throw null;
        }
        textView.setText(i);
        A00();
    }

    public final void setTitle(int i) {
        this.A0B = AnonymousClass0wJ.A0k(getContext(), i);
        TextView textView = this.A06;
        if (textView == null) {
            C04220Ms.A0E(DialogModule.KEY_TITLE);
            throw null;
        }
        textView.setText(i);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FindPeopleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        A01(context, attributeSet);
    }

    public final void setButtonText(String str) {
        C04220Ms.A0B(str, 0);
        this.A09 = str;
        TextView textView = this.A04;
        if (textView != null) {
            textView.setText(str);
            TextView textView2 = this.A04;
            if (textView2 != null) {
                textView2.setVisibility(0);
                A00();
                return;
            }
        }
        C04220Ms.A0E("actionButton");
        throw null;
    }

    public final void setSubtitle(String str) {
        C04220Ms.A0B(str, 0);
        this.A0A = str;
        TextView textView = this.A05;
        if (textView == null) {
            C04220Ms.A0E("subtitle");
            throw null;
        }
        textView.setText(str);
        A00();
    }

    public final void setTitle(String str) {
        C04220Ms.A0B(str, 0);
        this.A0B = str;
        TextView textView = this.A06;
        if (textView == null) {
            C04220Ms.A0E(DialogModule.KEY_TITLE);
            throw null;
        }
        textView.setText(str);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FindPeopleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
        A01(context, attributeSet);
    }
}
