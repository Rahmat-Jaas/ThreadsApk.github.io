package com.instagram.debug.devoptions.igds;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.B61;
import X.C04220Ms;
import X.C06750aI;
import X.C10300i6;
import X.C121907Is;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18240wQ;
import X.C18470xF;
import X.C34640IcN;
import X.C41030Luu;
import X.C82034oy;
import X.C86794yH;
import X.M5O;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IgdsPillExamplesFragment extends C34640IcN implements C82034oy {
    public static final String[] ITEMS = {"Show Pill with fade in and no spring animation", "Show Pill with fade in with spring animation", "Show Pill with no animation", "Update Pill position", "Show Pill with 0.5 opacity", "Show Pill with Facepile", "Show Pill with custom height"};
    public static final String MODULE_NAME = "igds_pill_examples";
    public Context mContext;
    public FrameLayout mFrameLayout;
    public RecyclerView mRV;
    public UserSession mUserSession;

    private void populateMenuItems() {
        final HashMap A0y = AnonymousClass0wJ.A0y();
        String[] strArr = ITEMS;
        String str = strArr[0];
        final String str2 = str;
        A0y.put(str, new View.OnClickListener(true, 0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (Drawable) null, -1, true) {
            public void onClick(View view) {
                int A01;
                View view2;
                int A05 = C14030oh.A05(-1679930086);
                B61 b61 = new B61(IgdsPillExamplesFragment.this.mContext, (View.OnClickListener) new View.OnClickListener() {
                    public void onClick(View view) {
                        C14030oh.A0C(-1517267669, C14030oh.A05(-312843444));
                    }
                }, "New Posts", true);
                b61.A05(IgdsPillExamplesFragment.this.mFrameLayout);
                int i = 0;
                if (i != 0) {
                    b61.A03(i);
                }
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && (view2 = b61.A02) != null) {
                    view2.setAlpha(f);
                }
                Drawable drawable = null;
                if (drawable != null) {
                    b61.A04(drawable);
                }
                int i2 = 100;
                if (i2 > 0 && (A01 = C18240wQ.A01(IgdsPillExamplesFragment.this.mContext, i2)) != b61.A00) {
                    b61.A00 = A01;
                    B61.A00(b61.A02, b61);
                }
                b61.A06(true);
                IgdsPillExamplesFragment.this.toggleHidePillView(view, b61, r13, this);
                C14030oh.A0C(1417781000, A05);
            }
        });
        String str3 = strArr[1];
        final String str4 = str3;
        A0y.put(str3, new View.OnClickListener(false, 0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (Drawable) null, -1, true) {
            public void onClick(View view) {
                int A01;
                View view2;
                int A05 = C14030oh.A05(-1679930086);
                B61 b61 = new B61(IgdsPillExamplesFragment.this.mContext, (View.OnClickListener) new View.OnClickListener() {
                    public void onClick(View view) {
                        C14030oh.A0C(-1517267669, C14030oh.A05(-312843444));
                    }
                }, "New Posts", true);
                b61.A05(IgdsPillExamplesFragment.this.mFrameLayout);
                int i = 0;
                if (i != 0) {
                    b61.A03(i);
                }
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && (view2 = b61.A02) != null) {
                    view2.setAlpha(f);
                }
                Drawable drawable = null;
                if (drawable != null) {
                    b61.A04(drawable);
                }
                int i2 = 100;
                if (i2 > 0 && (A01 = C18240wQ.A01(IgdsPillExamplesFragment.this.mContext, i2)) != b61.A00) {
                    b61.A00 = A01;
                    B61.A00(b61.A02, b61);
                }
                b61.A06(true);
                IgdsPillExamplesFragment.this.toggleHidePillView(view, b61, r13, this);
                C14030oh.A0C(1417781000, A05);
            }
        });
        String str5 = strArr[2];
        final String str6 = str5;
        A0y.put(str5, new View.OnClickListener(true, 0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (Drawable) null, -1, false) {
            public void onClick(View view) {
                int A01;
                View view2;
                int A05 = C14030oh.A05(-1679930086);
                B61 b61 = new B61(IgdsPillExamplesFragment.this.mContext, (View.OnClickListener) new View.OnClickListener() {
                    public void onClick(View view) {
                        C14030oh.A0C(-1517267669, C14030oh.A05(-312843444));
                    }
                }, "New Posts", true);
                b61.A05(IgdsPillExamplesFragment.this.mFrameLayout);
                int i = 0;
                if (i != 0) {
                    b61.A03(i);
                }
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && (view2 = b61.A02) != null) {
                    view2.setAlpha(f);
                }
                Drawable drawable = null;
                if (drawable != null) {
                    b61.A04(drawable);
                }
                int i2 = 100;
                if (i2 > 0 && (A01 = C18240wQ.A01(IgdsPillExamplesFragment.this.mContext, i2)) != b61.A00) {
                    b61.A00 = A01;
                    B61.A00(b61.A02, b61);
                }
                b61.A06(true);
                IgdsPillExamplesFragment.this.toggleHidePillView(view, b61, r13, this);
                C14030oh.A0C(1417781000, A05);
            }
        });
        String str7 = strArr[3];
        final String str8 = str7;
        A0y.put(str7, new View.OnClickListener(true, 200, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (Drawable) null, -1, true) {
            public void onClick(View view) {
                int A01;
                View view2;
                int A05 = C14030oh.A05(-1679930086);
                B61 b61 = new B61(IgdsPillExamplesFragment.this.mContext, (View.OnClickListener) new View.OnClickListener() {
                    public void onClick(View view) {
                        C14030oh.A0C(-1517267669, C14030oh.A05(-312843444));
                    }
                }, "New Posts", true);
                b61.A05(IgdsPillExamplesFragment.this.mFrameLayout);
                int i = 0;
                if (i != 0) {
                    b61.A03(i);
                }
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && (view2 = b61.A02) != null) {
                    view2.setAlpha(f);
                }
                Drawable drawable = null;
                if (drawable != null) {
                    b61.A04(drawable);
                }
                int i2 = 100;
                if (i2 > 0 && (A01 = C18240wQ.A01(IgdsPillExamplesFragment.this.mContext, i2)) != b61.A00) {
                    b61.A00 = A01;
                    B61.A00(b61.A02, b61);
                }
                b61.A06(true);
                IgdsPillExamplesFragment.this.toggleHidePillView(view, b61, r13, this);
                C14030oh.A0C(1417781000, A05);
            }
        });
        String str9 = strArr[4];
        final String str10 = str9;
        A0y.put(str9, new View.OnClickListener(true, 0, 0.5f, (Drawable) null, -1, true) {
            public void onClick(View view) {
                int A01;
                View view2;
                int A05 = C14030oh.A05(-1679930086);
                B61 b61 = new B61(IgdsPillExamplesFragment.this.mContext, (View.OnClickListener) new View.OnClickListener() {
                    public void onClick(View view) {
                        C14030oh.A0C(-1517267669, C14030oh.A05(-312843444));
                    }
                }, "New Posts", true);
                b61.A05(IgdsPillExamplesFragment.this.mFrameLayout);
                int i = 0;
                if (i != 0) {
                    b61.A03(i);
                }
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && (view2 = b61.A02) != null) {
                    view2.setAlpha(f);
                }
                Drawable drawable = null;
                if (drawable != null) {
                    b61.A04(drawable);
                }
                int i2 = 100;
                if (i2 > 0 && (A01 = C18240wQ.A01(IgdsPillExamplesFragment.this.mContext, i2)) != b61.A00) {
                    b61.A00 = A01;
                    B61.A00(b61.A02, b61);
                }
                b61.A06(true);
                IgdsPillExamplesFragment.this.toggleHidePillView(view, b61, r13, this);
                C14030oh.A0C(1417781000, A05);
            }
        });
        String str11 = strArr[5];
        Context context = this.mContext;
        C04220Ms.A0B(context, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin);
        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawColor(context.getColor(R.color.igds_photo_placeholder));
        List A17 = C06750aI.A17(createBitmap, createBitmap, createBitmap);
        Integer num = AnonymousClass006.A00;
        int A01 = C18240wQ.A01(context, 2);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (int i = 0; i < Math.min(3, A17.size()); i++) {
            C86794yH r11 = new C86794yH((ImageUrl) null, "", dimensionPixelSize, 1, C121907Is.A00(context, R.attr.avatarInnerStroke), A01, context.getColor(R.color.direct_widget_primary_background), 0, true);
            r11.A01((Bitmap) A17.get(i));
            A0v.add(r11);
        }
        final C18470xF r19 = new C18470xF(context, num, A0v, 0.4f, dimensionPixelSize, dimensionPixelSize, 0);
        final String str12 = str11;
        A0y.put(str11, new View.OnClickListener(true, 0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -1, true) {
            public void onClick(View view) {
                int A01;
                View view2;
                int A05 = C14030oh.A05(-1679930086);
                B61 b61 = new B61(IgdsPillExamplesFragment.this.mContext, (View.OnClickListener) new View.OnClickListener() {
                    public void onClick(View view) {
                        C14030oh.A0C(-1517267669, C14030oh.A05(-312843444));
                    }
                }, "New Posts", true);
                b61.A05(IgdsPillExamplesFragment.this.mFrameLayout);
                int i = 0;
                if (i != 0) {
                    b61.A03(i);
                }
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && (view2 = b61.A02) != null) {
                    view2.setAlpha(f);
                }
                Drawable drawable = null;
                if (drawable != null) {
                    b61.A04(drawable);
                }
                int i2 = 100;
                if (i2 > 0 && (A01 = C18240wQ.A01(IgdsPillExamplesFragment.this.mContext, i2)) != b61.A00) {
                    b61.A00 = A01;
                    B61.A00(b61.A02, b61);
                }
                b61.A06(true);
                IgdsPillExamplesFragment.this.toggleHidePillView(view, b61, r13, this);
                C14030oh.A0C(1417781000, A05);
            }
        });
        String str13 = strArr[6];
        final String str14 = str13;
        A0y.put(str13, new View.OnClickListener(true, 0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (Drawable) null, 100, true) {
            public void onClick(View view) {
                int A01;
                View view2;
                int A05 = C14030oh.A05(-1679930086);
                B61 b61 = new B61(IgdsPillExamplesFragment.this.mContext, (View.OnClickListener) new View.OnClickListener() {
                    public void onClick(View view) {
                        C14030oh.A0C(-1517267669, C14030oh.A05(-312843444));
                    }
                }, "New Posts", true);
                b61.A05(IgdsPillExamplesFragment.this.mFrameLayout);
                int i = 0;
                if (i != 0) {
                    b61.A03(i);
                }
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && (view2 = b61.A02) != null) {
                    view2.setAlpha(f);
                }
                Drawable drawable = null;
                if (drawable != null) {
                    b61.A04(drawable);
                }
                int i2 = 100;
                if (i2 > 0 && (A01 = C18240wQ.A01(IgdsPillExamplesFragment.this.mContext, i2)) != b61.A00) {
                    b61.A00 = A01;
                    B61.A00(b61.A02, b61);
                }
                b61.A06(true);
                IgdsPillExamplesFragment.this.toggleHidePillView(view, b61, str14, this);
                C14030oh.A0C(1417781000, A05);
            }
        });
        this.mRV.setAdapter(new C41030Luu() {
            public void onBindViewHolder(RowViewHolder rowViewHolder, final int i) {
                rowViewHolder.rowView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        int A05 = C14030oh.A05(-724257562);
                        View.OnClickListener onClickListener = (View.OnClickListener) A0y.get(IgdsPillExamplesFragment.ITEMS[i]);
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        C14030oh.A0C(1857001451, A05);
                    }
                });
                rowViewHolder.textView.setText(IgdsPillExamplesFragment.ITEMS[i]);
            }

            public int getItemCount() {
                int A03 = C14030oh.A03(-1741759732);
                int length = IgdsPillExamplesFragment.ITEMS.length;
                C14030oh.A0A(-1421775055, A03);
                return length;
            }

            public RowViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_header);
                return new RowViewHolder(viewGroup2, AnonymousClass0wJ.A0L(viewGroup2, R.id.row_header_textview));
            }
        });
    }

    public String getModuleName() {
        return MODULE_NAME;
    }

    public class RowViewHolder extends M5O {
        public ViewGroup rowView;
        public TextView textView;

        public RowViewHolder(ViewGroup viewGroup, TextView textView2) {
            super(viewGroup);
            this.rowView = viewGroup;
            this.textView = textView2;
        }
    }

    private View.OnClickListener getOnClickListener(String str, boolean z, boolean z2, int i, int i2, float f, Drawable drawable) {
        final String str2 = str;
        final boolean z3 = z;
        final boolean z4 = z2;
        final int i3 = i;
        final int i4 = i2;
        final float f2 = f;
        final Drawable drawable2 = drawable;
        return new View.OnClickListener() {
            public void onClick(View view) {
                int A01;
                View view2;
                int A05 = C14030oh.A05(-1679930086);
                B61 b61 = new B61(IgdsPillExamplesFragment.this.mContext, (View.OnClickListener) new View.OnClickListener() {
                    public void onClick(View view) {
                        C14030oh.A0C(-1517267669, C14030oh.A05(-312843444));
                    }
                }, "New Posts", true);
                b61.A05(IgdsPillExamplesFragment.this.mFrameLayout);
                int i = 0;
                if (i != 0) {
                    b61.A03(i);
                }
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && (view2 = b61.A02) != null) {
                    view2.setAlpha(f);
                }
                Drawable drawable = null;
                if (drawable != null) {
                    b61.A04(drawable);
                }
                int i2 = 100;
                if (i2 > 0 && (A01 = C18240wQ.A01(IgdsPillExamplesFragment.this.mContext, i2)) != b61.A00) {
                    b61.A00 = A01;
                    B61.A00(b61.A02, b61);
                }
                b61.A06(true);
                IgdsPillExamplesFragment.this.toggleHidePillView(view, b61, str14, this);
                C14030oh.A0C(1417781000, A05);
            }
        };
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    /* access modifiers changed from: private */
    public void toggleHidePillView(View view, B61 b61, String str, View.OnClickListener onClickListener) {
        final TextView A0L = AnonymousClass0wJ.A0L(view, R.id.row_header_textview);
        A0L.setText("Click to hide pill");
        final B61 b612 = b61;
        final String str2 = str;
        final View.OnClickListener onClickListener2 = onClickListener;
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = C14030oh.A05(774057999);
                b612.A01();
                A0L.setText(str2);
                view.setOnClickListener(onClickListener2);
                C14030oh.A0C(2096921367, A05);
            }
        });
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131825248);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1391236924);
        super.onCreate(bundle);
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        this.mContext = requireContext();
        C14030oh.A09(-607763037, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-2024462507);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        FrameLayout frameLayout = (FrameLayout) AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.igds_component_examples);
        this.mFrameLayout = frameLayout;
        RecyclerView recyclerView = (RecyclerView) frameLayout.requireViewById(16908298);
        this.mRV = recyclerView;
        C18190wL.A1D(recyclerView);
        populateMenuItems();
        FrameLayout frameLayout2 = this.mFrameLayout;
        C14030oh.A09(-1586938894, A02);
        return frameLayout2;
    }
}
