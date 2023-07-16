package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass25l;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C11630kW;
import X.C13950oZ;
import X.C14030oh;
import X.C15720rm;
import X.C18190wL;
import X.C18330wh;
import X.C21735BzM;
import X.C23411dm;
import X.C25828Dsm;
import X.C63613hu;
import X.C82034oy;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public class IgdsDialogStyleExamplesFragment extends C23411dm implements C21735BzM, C82034oy {
    public static final String CANCEL_BUTTON_LABEL = "Cancel";
    public static final String LONG_BUTTON_LABEL = "Regular Button With Meaninglessly Long Text For Stress Test";
    public static final String MESSAGE = "This is just an ordinary placeholder message that should span a few lines";
    public static final String NEGATIVE_BUTTON_LABEL = "Negative";
    public static final String PRIMARY_BUTTON_LABEL = "OK";
    public static final String TITLE = "Regular length title";
    public C11630kW mAnalyticsModule;
    public Context mContext;
    public ImageUrl mImageUrl;
    public UserSession mUserSession;

    public enum ImageType {
        CUSTOM,
        CIRCULAR,
        FREEFORM,
        FULL_WIDTH_HEADER,
        HEADER,
        FACEPILE,
        RECTANGULAR,
        SQUARE,
        NONE
    }

    public String getModuleName() {
        return "igds_dialog_style_examples";
    }

    public /* synthetic */ void onBottomSheetClosed() {
    }

    public /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* renamed from: com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment$3  reason: invalid class name */
    public /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$instagram$debug$devoptions$igds$IgdsDialogStyleExamplesFragment$ImageType;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0025 */
        static {
            /*
                com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment$ImageType[] r0 = com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment.ImageType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                $SwitchMap$com$instagram$debug$devoptions$igds$IgdsDialogStyleExamplesFragment$ImageType = r2
                com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment$ImageType r0 = com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment.ImageType.CUSTOM     // Catch:{ NoSuchFieldError -> 0x000e }
                X.C18240wQ.A1E(r0, r2)     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment$ImageType r0 = com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment.ImageType.SQUARE     // Catch:{ NoSuchFieldError -> 0x0013 }
                X.C18240wQ.A1F(r0, r2)     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment$ImageType r0 = com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment.ImageType.RECTANGULAR     // Catch:{ NoSuchFieldError -> 0x001c }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment$ImageType r0 = com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment.ImageType.FACEPILE     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0025 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0025 }
            L_0x0025:
                com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment$ImageType r0 = com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment.ImageType.NONE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.igds.IgdsDialogStyleExamplesFragment.AnonymousClass3.<clinit>():void");
        }
    }

    private View.OnClickListener getClickListener(boolean z, boolean z2, String str, String str2, ImageType imageType, AnonymousClass25l r15, AnonymousClass25l r16) {
        final boolean z3 = z;
        final boolean z4 = z2;
        final String str3 = str;
        final String str4 = str2;
        final ImageType imageType2 = imageType;
        final AnonymousClass25l r8 = r15;
        final AnonymousClass25l r5 = r16;
        return new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1947891296);
                C25828Dsm A0W = C18190wL.A0W(IgdsDialogStyleExamplesFragment.this.mContext);
                if (true) {
                    A0W.A02 = IgdsDialogStyleExamplesFragment.TITLE;
                }
                if (false) {
                    A0W.A0p(IgdsDialogStyleExamplesFragment.MESSAGE);
                }
                String str = IgdsDialogStyleExamplesFragment.LONG_BUTTON_LABEL;
                if (str != null) {
                    A0W.A0W((DialogInterface.OnClickListener) null, r7, str, true);
                }
                String str2 = r8;
                if (str2 != null) {
                    A0W.A0b((DialogInterface.OnClickListener) null, str2);
                }
                int ordinal = r9.ordinal();
                if (ordinal == 0) {
                    Drawable drawable = IgdsDialogStyleExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                    IgdsHeadline igdsHeadline = A0W.A0I;
                    ImageView A00 = IgdsHeadline.A00(igdsHeadline);
                    A00.setImageDrawable(drawable);
                    A00.setImageTintList(ColorStateList.valueOf(igdsHeadline.getContext().getColor(R.color.igds_creation_tools_red)));
                    igdsHeadline.setVisibility(0);
                    A0W.A0H();
                } else if (ordinal != 7) {
                    int i = 0;
                    if (ordinal == 6) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0W.A06.getResources(), IgdsDialogStyleExamplesFragment.this.getRectangularImage());
                        IgdsHeadline igdsHeadline2 = A0W.A0I;
                        IgdsHeadline.A00(igdsHeadline2).setImageDrawable(bitmapDrawable);
                        igdsHeadline2.setVisibility(0);
                        A0W.A0H();
                    } else if (ordinal == 5) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        do {
                            A0v.add(IgdsDialogStyleExamplesFragment.this.mImageUrl);
                            i++;
                        } while (i < 3);
                        A0W.A0I.setFacepile(A0v, "igds_dialog_style_examples");
                    }
                } else {
                    IgdsDialogStyleExamplesFragment igdsDialogStyleExamplesFragment = IgdsDialogStyleExamplesFragment.this;
                    A0W.A0o(igdsDialogStyleExamplesFragment.mImageUrl, igdsDialogStyleExamplesFragment.mAnalyticsModule);
                }
                A0W.A0Y((DialogInterface.OnClickListener) null, r10, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, true);
                A0W.A0q(true);
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
                C14030oh.A0C(-626075049, A05);
            }
        };
    }

    /* access modifiers changed from: private */
    public Bitmap getRectangularImage() {
        Bitmap createBitmap = Bitmap.createBitmap(500, 300, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(this.mContext.getColor(R.color.igds_creation_tools_purple));
        canvas.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 500.0f, 300.0f, paint);
        return createBitmap;
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    private void setAndCreateItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A01("IGDS Dialog Style", A0v);
        AnonymousClass4MA.A02(new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = C14030oh.A05(-1134908995);
                C18330wh r1 = new C18330wh(IgdsDialogStyleExamplesFragment.this.mContext);
                r1.A04("hello");
                r1.setCancelable(true);
                r1.setCanceledOnTouchOutside(true);
                C13950oZ.A00(r1);
                C14030oh.A0C(-1050913046, A05);
            }
        }, "Progress Dialog", A0v);
        final ImageType imageType = ImageType.CUSTOM;
        final AnonymousClass25l r10 = AnonymousClass25l.BLUE_BOLD;
        AnonymousClass4MA.A02(new View.OnClickListener(true, true, (String) null, (AnonymousClass25l) null, (String) null) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1947891296);
                C25828Dsm A0W = C18190wL.A0W(IgdsDialogStyleExamplesFragment.this.mContext);
                if (true) {
                    A0W.A02 = IgdsDialogStyleExamplesFragment.TITLE;
                }
                if (false) {
                    A0W.A0p(IgdsDialogStyleExamplesFragment.MESSAGE);
                }
                String str = IgdsDialogStyleExamplesFragment.LONG_BUTTON_LABEL;
                if (str != null) {
                    A0W.A0W((DialogInterface.OnClickListener) null, r7, str, true);
                }
                String str2 = r8;
                if (str2 != null) {
                    A0W.A0b((DialogInterface.OnClickListener) null, str2);
                }
                int ordinal = r9.ordinal();
                if (ordinal == 0) {
                    Drawable drawable = IgdsDialogStyleExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                    IgdsHeadline igdsHeadline = A0W.A0I;
                    ImageView A00 = IgdsHeadline.A00(igdsHeadline);
                    A00.setImageDrawable(drawable);
                    A00.setImageTintList(ColorStateList.valueOf(igdsHeadline.getContext().getColor(R.color.igds_creation_tools_red)));
                    igdsHeadline.setVisibility(0);
                    A0W.A0H();
                } else if (ordinal != 7) {
                    int i = 0;
                    if (ordinal == 6) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0W.A06.getResources(), IgdsDialogStyleExamplesFragment.this.getRectangularImage());
                        IgdsHeadline igdsHeadline2 = A0W.A0I;
                        IgdsHeadline.A00(igdsHeadline2).setImageDrawable(bitmapDrawable);
                        igdsHeadline2.setVisibility(0);
                        A0W.A0H();
                    } else if (ordinal == 5) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        do {
                            A0v.add(IgdsDialogStyleExamplesFragment.this.mImageUrl);
                            i++;
                        } while (i < 3);
                        A0W.A0I.setFacepile(A0v, "igds_dialog_style_examples");
                    }
                } else {
                    IgdsDialogStyleExamplesFragment igdsDialogStyleExamplesFragment = IgdsDialogStyleExamplesFragment.this;
                    A0W.A0o(igdsDialogStyleExamplesFragment.mImageUrl, igdsDialogStyleExamplesFragment.mAnalyticsModule);
                }
                A0W.A0Y((DialogInterface.OnClickListener) null, r10, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, true);
                A0W.A0q(true);
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
                C14030oh.A0C(-626075049, A05);
            }
        }, "Headline, body, custom image, one button", A0v);
        final ImageType imageType2 = ImageType.NONE;
        AnonymousClass4MA.A02(new View.OnClickListener(true, true, (String) null, (AnonymousClass25l) null, (String) null) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1947891296);
                C25828Dsm A0W = C18190wL.A0W(IgdsDialogStyleExamplesFragment.this.mContext);
                if (true) {
                    A0W.A02 = IgdsDialogStyleExamplesFragment.TITLE;
                }
                if (false) {
                    A0W.A0p(IgdsDialogStyleExamplesFragment.MESSAGE);
                }
                String str = IgdsDialogStyleExamplesFragment.LONG_BUTTON_LABEL;
                if (str != null) {
                    A0W.A0W((DialogInterface.OnClickListener) null, r7, str, true);
                }
                String str2 = r8;
                if (str2 != null) {
                    A0W.A0b((DialogInterface.OnClickListener) null, str2);
                }
                int ordinal = imageType2.ordinal();
                if (ordinal == 0) {
                    Drawable drawable = IgdsDialogStyleExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                    IgdsHeadline igdsHeadline = A0W.A0I;
                    ImageView A00 = IgdsHeadline.A00(igdsHeadline);
                    A00.setImageDrawable(drawable);
                    A00.setImageTintList(ColorStateList.valueOf(igdsHeadline.getContext().getColor(R.color.igds_creation_tools_red)));
                    igdsHeadline.setVisibility(0);
                    A0W.A0H();
                } else if (ordinal != 7) {
                    int i = 0;
                    if (ordinal == 6) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0W.A06.getResources(), IgdsDialogStyleExamplesFragment.this.getRectangularImage());
                        IgdsHeadline igdsHeadline2 = A0W.A0I;
                        IgdsHeadline.A00(igdsHeadline2).setImageDrawable(bitmapDrawable);
                        igdsHeadline2.setVisibility(0);
                        A0W.A0H();
                    } else if (ordinal == 5) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        do {
                            A0v.add(IgdsDialogStyleExamplesFragment.this.mImageUrl);
                            i++;
                        } while (i < 3);
                        A0W.A0I.setFacepile(A0v, "igds_dialog_style_examples");
                    }
                } else {
                    IgdsDialogStyleExamplesFragment igdsDialogStyleExamplesFragment = IgdsDialogStyleExamplesFragment.this;
                    A0W.A0o(igdsDialogStyleExamplesFragment.mImageUrl, igdsDialogStyleExamplesFragment.mAnalyticsModule);
                }
                A0W.A0Y((DialogInterface.OnClickListener) null, r10, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, true);
                A0W.A0q(true);
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
                C14030oh.A0C(-626075049, A05);
            }
        }, "Headline, body, one button", A0v);
        final ImageType imageType3 = imageType2;
        final AnonymousClass25l r19 = r10;
        AnonymousClass4MA.A02(new View.OnClickListener(false, true, (String) null, (AnonymousClass25l) null, (String) null) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1947891296);
                C25828Dsm A0W = C18190wL.A0W(IgdsDialogStyleExamplesFragment.this.mContext);
                if (true) {
                    A0W.A02 = IgdsDialogStyleExamplesFragment.TITLE;
                }
                if (false) {
                    A0W.A0p(IgdsDialogStyleExamplesFragment.MESSAGE);
                }
                String str = IgdsDialogStyleExamplesFragment.LONG_BUTTON_LABEL;
                if (str != null) {
                    A0W.A0W((DialogInterface.OnClickListener) null, r7, str, true);
                }
                String str2 = r8;
                if (str2 != null) {
                    A0W.A0b((DialogInterface.OnClickListener) null, str2);
                }
                int ordinal = imageType2.ordinal();
                if (ordinal == 0) {
                    Drawable drawable = IgdsDialogStyleExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                    IgdsHeadline igdsHeadline = A0W.A0I;
                    ImageView A00 = IgdsHeadline.A00(igdsHeadline);
                    A00.setImageDrawable(drawable);
                    A00.setImageTintList(ColorStateList.valueOf(igdsHeadline.getContext().getColor(R.color.igds_creation_tools_red)));
                    igdsHeadline.setVisibility(0);
                    A0W.A0H();
                } else if (ordinal != 7) {
                    int i = 0;
                    if (ordinal == 6) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0W.A06.getResources(), IgdsDialogStyleExamplesFragment.this.getRectangularImage());
                        IgdsHeadline igdsHeadline2 = A0W.A0I;
                        IgdsHeadline.A00(igdsHeadline2).setImageDrawable(bitmapDrawable);
                        igdsHeadline2.setVisibility(0);
                        A0W.A0H();
                    } else if (ordinal == 5) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        do {
                            A0v.add(IgdsDialogStyleExamplesFragment.this.mImageUrl);
                            i++;
                        } while (i < 3);
                        A0W.A0I.setFacepile(A0v, "igds_dialog_style_examples");
                    }
                } else {
                    IgdsDialogStyleExamplesFragment igdsDialogStyleExamplesFragment = IgdsDialogStyleExamplesFragment.this;
                    A0W.A0o(igdsDialogStyleExamplesFragment.mImageUrl, igdsDialogStyleExamplesFragment.mAnalyticsModule);
                }
                A0W.A0Y((DialogInterface.OnClickListener) null, r10, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, true);
                A0W.A0q(true);
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
                C14030oh.A0C(-626075049, A05);
            }
        }, "Body only, one button", A0v);
        final ImageType imageType4 = ImageType.RECTANGULAR;
        final AnonymousClass25l r23 = r10;
        AnonymousClass4MA.A02(new View.OnClickListener(true, false, "Cancel", (AnonymousClass25l) null, (String) null) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1947891296);
                C25828Dsm A0W = C18190wL.A0W(IgdsDialogStyleExamplesFragment.this.mContext);
                if (true) {
                    A0W.A02 = IgdsDialogStyleExamplesFragment.TITLE;
                }
                if (false) {
                    A0W.A0p(IgdsDialogStyleExamplesFragment.MESSAGE);
                }
                String str = IgdsDialogStyleExamplesFragment.LONG_BUTTON_LABEL;
                if (str != null) {
                    A0W.A0W((DialogInterface.OnClickListener) null, r7, str, true);
                }
                String str2 = r8;
                if (str2 != null) {
                    A0W.A0b((DialogInterface.OnClickListener) null, str2);
                }
                int ordinal = imageType2.ordinal();
                if (ordinal == 0) {
                    Drawable drawable = IgdsDialogStyleExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                    IgdsHeadline igdsHeadline = A0W.A0I;
                    ImageView A00 = IgdsHeadline.A00(igdsHeadline);
                    A00.setImageDrawable(drawable);
                    A00.setImageTintList(ColorStateList.valueOf(igdsHeadline.getContext().getColor(R.color.igds_creation_tools_red)));
                    igdsHeadline.setVisibility(0);
                    A0W.A0H();
                } else if (ordinal != 7) {
                    int i = 0;
                    if (ordinal == 6) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0W.A06.getResources(), IgdsDialogStyleExamplesFragment.this.getRectangularImage());
                        IgdsHeadline igdsHeadline2 = A0W.A0I;
                        IgdsHeadline.A00(igdsHeadline2).setImageDrawable(bitmapDrawable);
                        igdsHeadline2.setVisibility(0);
                        A0W.A0H();
                    } else if (ordinal == 5) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        do {
                            A0v.add(IgdsDialogStyleExamplesFragment.this.mImageUrl);
                            i++;
                        } while (i < 3);
                        A0W.A0I.setFacepile(A0v, "igds_dialog_style_examples");
                    }
                } else {
                    IgdsDialogStyleExamplesFragment igdsDialogStyleExamplesFragment = IgdsDialogStyleExamplesFragment.this;
                    A0W.A0o(igdsDialogStyleExamplesFragment.mImageUrl, igdsDialogStyleExamplesFragment.mAnalyticsModule);
                }
                A0W.A0Y((DialogInterface.OnClickListener) null, r10, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, true);
                A0W.A0q(true);
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
                C14030oh.A0C(-626075049, A05);
            }
        }, "Headline, rectangular image, two buttons", A0v);
        final ImageType imageType5 = ImageType.SQUARE;
        final AnonymousClass25l r29 = r10;
        AnonymousClass4MA.A02(new View.OnClickListener(false, true, (String) null, (AnonymousClass25l) null, (String) null) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1947891296);
                C25828Dsm A0W = C18190wL.A0W(IgdsDialogStyleExamplesFragment.this.mContext);
                if (true) {
                    A0W.A02 = IgdsDialogStyleExamplesFragment.TITLE;
                }
                if (false) {
                    A0W.A0p(IgdsDialogStyleExamplesFragment.MESSAGE);
                }
                String str = IgdsDialogStyleExamplesFragment.LONG_BUTTON_LABEL;
                if (str != null) {
                    A0W.A0W((DialogInterface.OnClickListener) null, r7, str, true);
                }
                String str2 = r8;
                if (str2 != null) {
                    A0W.A0b((DialogInterface.OnClickListener) null, str2);
                }
                int ordinal = imageType2.ordinal();
                if (ordinal == 0) {
                    Drawable drawable = IgdsDialogStyleExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                    IgdsHeadline igdsHeadline = A0W.A0I;
                    ImageView A00 = IgdsHeadline.A00(igdsHeadline);
                    A00.setImageDrawable(drawable);
                    A00.setImageTintList(ColorStateList.valueOf(igdsHeadline.getContext().getColor(R.color.igds_creation_tools_red)));
                    igdsHeadline.setVisibility(0);
                    A0W.A0H();
                } else if (ordinal != 7) {
                    int i = 0;
                    if (ordinal == 6) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0W.A06.getResources(), IgdsDialogStyleExamplesFragment.this.getRectangularImage());
                        IgdsHeadline igdsHeadline2 = A0W.A0I;
                        IgdsHeadline.A00(igdsHeadline2).setImageDrawable(bitmapDrawable);
                        igdsHeadline2.setVisibility(0);
                        A0W.A0H();
                    } else if (ordinal == 5) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        do {
                            A0v.add(IgdsDialogStyleExamplesFragment.this.mImageUrl);
                            i++;
                        } while (i < 3);
                        A0W.A0I.setFacepile(A0v, "igds_dialog_style_examples");
                    }
                } else {
                    IgdsDialogStyleExamplesFragment igdsDialogStyleExamplesFragment = IgdsDialogStyleExamplesFragment.this;
                    A0W.A0o(igdsDialogStyleExamplesFragment.mImageUrl, igdsDialogStyleExamplesFragment.mAnalyticsModule);
                }
                A0W.A0Y((DialogInterface.OnClickListener) null, r10, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, true);
                A0W.A0q(true);
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
                C14030oh.A0C(-626075049, A05);
            }
        }, "Body only, square image, one button", A0v);
        final String str = "Cancel";
        final AnonymousClass25l r7 = r10;
        AnonymousClass4MA.A02(new View.OnClickListener(true, true, (String) null) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1947891296);
                C25828Dsm A0W = C18190wL.A0W(IgdsDialogStyleExamplesFragment.this.mContext);
                if (true) {
                    A0W.A02 = IgdsDialogStyleExamplesFragment.TITLE;
                }
                if (false) {
                    A0W.A0p(IgdsDialogStyleExamplesFragment.MESSAGE);
                }
                String str = IgdsDialogStyleExamplesFragment.LONG_BUTTON_LABEL;
                if (str != null) {
                    A0W.A0W((DialogInterface.OnClickListener) null, r7, str, true);
                }
                String str2 = r8;
                if (str2 != null) {
                    A0W.A0b((DialogInterface.OnClickListener) null, str2);
                }
                int ordinal = imageType2.ordinal();
                if (ordinal == 0) {
                    Drawable drawable = IgdsDialogStyleExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                    IgdsHeadline igdsHeadline = A0W.A0I;
                    ImageView A00 = IgdsHeadline.A00(igdsHeadline);
                    A00.setImageDrawable(drawable);
                    A00.setImageTintList(ColorStateList.valueOf(igdsHeadline.getContext().getColor(R.color.igds_creation_tools_red)));
                    igdsHeadline.setVisibility(0);
                    A0W.A0H();
                } else if (ordinal != 7) {
                    int i = 0;
                    if (ordinal == 6) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0W.A06.getResources(), IgdsDialogStyleExamplesFragment.this.getRectangularImage());
                        IgdsHeadline igdsHeadline2 = A0W.A0I;
                        IgdsHeadline.A00(igdsHeadline2).setImageDrawable(bitmapDrawable);
                        igdsHeadline2.setVisibility(0);
                        A0W.A0H();
                    } else if (ordinal == 5) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        do {
                            A0v.add(IgdsDialogStyleExamplesFragment.this.mImageUrl);
                            i++;
                        } while (i < 3);
                        A0W.A0I.setFacepile(A0v, "igds_dialog_style_examples");
                    }
                } else {
                    IgdsDialogStyleExamplesFragment igdsDialogStyleExamplesFragment = IgdsDialogStyleExamplesFragment.this;
                    A0W.A0o(igdsDialogStyleExamplesFragment.mImageUrl, igdsDialogStyleExamplesFragment.mAnalyticsModule);
                }
                A0W.A0Y((DialogInterface.OnClickListener) null, r10, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, true);
                A0W.A0q(true);
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
                C14030oh.A0C(-626075049, A05);
            }
        }, "Headline, body, two primary buttons", A0v);
        final AnonymousClass25l r72 = AnonymousClass25l.RED;
        AnonymousClass4MA.A02(new View.OnClickListener(true, true, (String) null) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1947891296);
                C25828Dsm A0W = C18190wL.A0W(IgdsDialogStyleExamplesFragment.this.mContext);
                if (true) {
                    A0W.A02 = IgdsDialogStyleExamplesFragment.TITLE;
                }
                if (false) {
                    A0W.A0p(IgdsDialogStyleExamplesFragment.MESSAGE);
                }
                String str = IgdsDialogStyleExamplesFragment.LONG_BUTTON_LABEL;
                if (str != null) {
                    A0W.A0W((DialogInterface.OnClickListener) null, r7, str, true);
                }
                String str2 = r8;
                if (str2 != null) {
                    A0W.A0b((DialogInterface.OnClickListener) null, str2);
                }
                int ordinal = imageType2.ordinal();
                if (ordinal == 0) {
                    Drawable drawable = IgdsDialogStyleExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                    IgdsHeadline igdsHeadline = A0W.A0I;
                    ImageView A00 = IgdsHeadline.A00(igdsHeadline);
                    A00.setImageDrawable(drawable);
                    A00.setImageTintList(ColorStateList.valueOf(igdsHeadline.getContext().getColor(R.color.igds_creation_tools_red)));
                    igdsHeadline.setVisibility(0);
                    A0W.A0H();
                } else if (ordinal != 7) {
                    int i = 0;
                    if (ordinal == 6) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0W.A06.getResources(), IgdsDialogStyleExamplesFragment.this.getRectangularImage());
                        IgdsHeadline igdsHeadline2 = A0W.A0I;
                        IgdsHeadline.A00(igdsHeadline2).setImageDrawable(bitmapDrawable);
                        igdsHeadline2.setVisibility(0);
                        A0W.A0H();
                    } else if (ordinal == 5) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        do {
                            A0v.add(IgdsDialogStyleExamplesFragment.this.mImageUrl);
                            i++;
                        } while (i < 3);
                        A0W.A0I.setFacepile(A0v, "igds_dialog_style_examples");
                    }
                } else {
                    IgdsDialogStyleExamplesFragment igdsDialogStyleExamplesFragment = IgdsDialogStyleExamplesFragment.this;
                    A0W.A0o(igdsDialogStyleExamplesFragment.mImageUrl, igdsDialogStyleExamplesFragment.mAnalyticsModule);
                }
                A0W.A0Y((DialogInterface.OnClickListener) null, r10, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, true);
                A0W.A0q(true);
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
                C14030oh.A0C(-626075049, A05);
            }
        }, "Headline, body, two buttons, red auxiliary button", A0v);
        final AnonymousClass25l r292 = AnonymousClass25l.RED_BOLD;
        final AnonymousClass25l r26 = AnonymousClass25l.DEFAULT;
        final String str2 = str;
        final ImageType imageType6 = imageType2;
        AnonymousClass4MA.A02(new View.OnClickListener(true, false, (String) null) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1947891296);
                C25828Dsm A0W = C18190wL.A0W(IgdsDialogStyleExamplesFragment.this.mContext);
                if (true) {
                    A0W.A02 = IgdsDialogStyleExamplesFragment.TITLE;
                }
                if (false) {
                    A0W.A0p(IgdsDialogStyleExamplesFragment.MESSAGE);
                }
                String str = IgdsDialogStyleExamplesFragment.LONG_BUTTON_LABEL;
                if (str != null) {
                    A0W.A0W((DialogInterface.OnClickListener) null, r7, str, true);
                }
                String str2 = r8;
                if (str2 != null) {
                    A0W.A0b((DialogInterface.OnClickListener) null, str2);
                }
                int ordinal = imageType2.ordinal();
                if (ordinal == 0) {
                    Drawable drawable = IgdsDialogStyleExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                    IgdsHeadline igdsHeadline = A0W.A0I;
                    ImageView A00 = IgdsHeadline.A00(igdsHeadline);
                    A00.setImageDrawable(drawable);
                    A00.setImageTintList(ColorStateList.valueOf(igdsHeadline.getContext().getColor(R.color.igds_creation_tools_red)));
                    igdsHeadline.setVisibility(0);
                    A0W.A0H();
                } else if (ordinal != 7) {
                    int i = 0;
                    if (ordinal == 6) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0W.A06.getResources(), IgdsDialogStyleExamplesFragment.this.getRectangularImage());
                        IgdsHeadline igdsHeadline2 = A0W.A0I;
                        IgdsHeadline.A00(igdsHeadline2).setImageDrawable(bitmapDrawable);
                        igdsHeadline2.setVisibility(0);
                        A0W.A0H();
                    } else if (ordinal == 5) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        do {
                            A0v.add(IgdsDialogStyleExamplesFragment.this.mImageUrl);
                            i++;
                        } while (i < 3);
                        A0W.A0I.setFacepile(A0v, "igds_dialog_style_examples");
                    }
                } else {
                    IgdsDialogStyleExamplesFragment igdsDialogStyleExamplesFragment = IgdsDialogStyleExamplesFragment.this;
                    A0W.A0o(igdsDialogStyleExamplesFragment.mImageUrl, igdsDialogStyleExamplesFragment.mAnalyticsModule);
                }
                A0W.A0Y((DialogInterface.OnClickListener) null, r10, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, true);
                A0W.A0q(true);
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
                C14030oh.A0C(-626075049, A05);
            }
        }, "Headline, two buttons, red primary button", A0v);
        final AnonymousClass25l r73 = r26;
        AnonymousClass4MA.A02(new View.OnClickListener(true, true, NEGATIVE_BUTTON_LABEL) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1947891296);
                C25828Dsm A0W = C18190wL.A0W(IgdsDialogStyleExamplesFragment.this.mContext);
                if (true) {
                    A0W.A02 = IgdsDialogStyleExamplesFragment.TITLE;
                }
                if (false) {
                    A0W.A0p(IgdsDialogStyleExamplesFragment.MESSAGE);
                }
                String str = IgdsDialogStyleExamplesFragment.LONG_BUTTON_LABEL;
                if (str != null) {
                    A0W.A0W((DialogInterface.OnClickListener) null, r73, str, true);
                }
                String str2 = r8;
                if (str2 != null) {
                    A0W.A0b((DialogInterface.OnClickListener) null, str2);
                }
                int ordinal = imageType2.ordinal();
                if (ordinal == 0) {
                    Drawable drawable = IgdsDialogStyleExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                    IgdsHeadline igdsHeadline = A0W.A0I;
                    ImageView A00 = IgdsHeadline.A00(igdsHeadline);
                    A00.setImageDrawable(drawable);
                    A00.setImageTintList(ColorStateList.valueOf(igdsHeadline.getContext().getColor(R.color.igds_creation_tools_red)));
                    igdsHeadline.setVisibility(0);
                    A0W.A0H();
                } else if (ordinal != 7) {
                    int i = 0;
                    if (ordinal == 6) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0W.A06.getResources(), IgdsDialogStyleExamplesFragment.this.getRectangularImage());
                        IgdsHeadline igdsHeadline2 = A0W.A0I;
                        IgdsHeadline.A00(igdsHeadline2).setImageDrawable(bitmapDrawable);
                        igdsHeadline2.setVisibility(0);
                        A0W.A0H();
                    } else if (ordinal == 5) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        do {
                            A0v.add(IgdsDialogStyleExamplesFragment.this.mImageUrl);
                            i++;
                        } while (i < 3);
                        A0W.A0I.setFacepile(A0v, "igds_dialog_style_examples");
                    }
                } else {
                    IgdsDialogStyleExamplesFragment igdsDialogStyleExamplesFragment = IgdsDialogStyleExamplesFragment.this;
                    A0W.A0o(igdsDialogStyleExamplesFragment.mImageUrl, igdsDialogStyleExamplesFragment.mAnalyticsModule);
                }
                A0W.A0Y((DialogInterface.OnClickListener) null, r10, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, true);
                A0W.A0q(true);
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
                C14030oh.A0C(-626075049, A05);
            }
        }, "Headline, body, three buttons", A0v);
        final ImageType imageType7 = ImageType.FACEPILE;
        final AnonymousClass25l r192 = r10;
        AnonymousClass4MA.A02(new View.OnClickListener(true, true, (String) null, (AnonymousClass25l) null, (String) null) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1947891296);
                C25828Dsm A0W = C18190wL.A0W(IgdsDialogStyleExamplesFragment.this.mContext);
                if (true) {
                    A0W.A02 = IgdsDialogStyleExamplesFragment.TITLE;
                }
                if (false) {
                    A0W.A0p(IgdsDialogStyleExamplesFragment.MESSAGE);
                }
                String str = IgdsDialogStyleExamplesFragment.LONG_BUTTON_LABEL;
                if (str != null) {
                    A0W.A0W((DialogInterface.OnClickListener) null, r73, str, true);
                }
                String str2 = r8;
                if (str2 != null) {
                    A0W.A0b((DialogInterface.OnClickListener) null, str2);
                }
                int ordinal = imageType2.ordinal();
                if (ordinal == 0) {
                    Drawable drawable = IgdsDialogStyleExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                    IgdsHeadline igdsHeadline = A0W.A0I;
                    ImageView A00 = IgdsHeadline.A00(igdsHeadline);
                    A00.setImageDrawable(drawable);
                    A00.setImageTintList(ColorStateList.valueOf(igdsHeadline.getContext().getColor(R.color.igds_creation_tools_red)));
                    igdsHeadline.setVisibility(0);
                    A0W.A0H();
                } else if (ordinal != 7) {
                    int i = 0;
                    if (ordinal == 6) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0W.A06.getResources(), IgdsDialogStyleExamplesFragment.this.getRectangularImage());
                        IgdsHeadline igdsHeadline2 = A0W.A0I;
                        IgdsHeadline.A00(igdsHeadline2).setImageDrawable(bitmapDrawable);
                        igdsHeadline2.setVisibility(0);
                        A0W.A0H();
                    } else if (ordinal == 5) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        do {
                            A0v.add(IgdsDialogStyleExamplesFragment.this.mImageUrl);
                            i++;
                        } while (i < 3);
                        A0W.A0I.setFacepile(A0v, "igds_dialog_style_examples");
                    }
                } else {
                    IgdsDialogStyleExamplesFragment igdsDialogStyleExamplesFragment = IgdsDialogStyleExamplesFragment.this;
                    A0W.A0o(igdsDialogStyleExamplesFragment.mImageUrl, igdsDialogStyleExamplesFragment.mAnalyticsModule);
                }
                A0W.A0Y((DialogInterface.OnClickListener) null, r10, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, true);
                A0W.A0q(true);
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
                C14030oh.A0C(-626075049, A05);
            }
        }, "Headline, body, facepile, one button", A0v);
        final String str3 = LONG_BUTTON_LABEL;
        AnonymousClass4MA.A02(new View.OnClickListener(true, false, LONG_BUTTON_LABEL) {
            public void onClick(View view) {
                int A05 = C14030oh.A05(1947891296);
                C25828Dsm A0W = C18190wL.A0W(IgdsDialogStyleExamplesFragment.this.mContext);
                if (true) {
                    A0W.A02 = IgdsDialogStyleExamplesFragment.TITLE;
                }
                if (false) {
                    A0W.A0p(IgdsDialogStyleExamplesFragment.MESSAGE);
                }
                String str = IgdsDialogStyleExamplesFragment.LONG_BUTTON_LABEL;
                if (str != null) {
                    A0W.A0W((DialogInterface.OnClickListener) null, r73, str, true);
                }
                String str2 = str3;
                if (str2 != null) {
                    A0W.A0b((DialogInterface.OnClickListener) null, str2);
                }
                int ordinal = imageType2.ordinal();
                if (ordinal == 0) {
                    Drawable drawable = IgdsDialogStyleExamplesFragment.this.mContext.getDrawable(R.drawable.instagram_heart_filled_44);
                    IgdsHeadline igdsHeadline = A0W.A0I;
                    ImageView A00 = IgdsHeadline.A00(igdsHeadline);
                    A00.setImageDrawable(drawable);
                    A00.setImageTintList(ColorStateList.valueOf(igdsHeadline.getContext().getColor(R.color.igds_creation_tools_red)));
                    igdsHeadline.setVisibility(0);
                    A0W.A0H();
                } else if (ordinal != 7) {
                    int i = 0;
                    if (ordinal == 6) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(A0W.A06.getResources(), IgdsDialogStyleExamplesFragment.this.getRectangularImage());
                        IgdsHeadline igdsHeadline2 = A0W.A0I;
                        IgdsHeadline.A00(igdsHeadline2).setImageDrawable(bitmapDrawable);
                        igdsHeadline2.setVisibility(0);
                        A0W.A0H();
                    } else if (ordinal == 5) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        do {
                            A0v.add(IgdsDialogStyleExamplesFragment.this.mImageUrl);
                            i++;
                        } while (i < 3);
                        A0W.A0I.setFacepile(A0v, "igds_dialog_style_examples");
                    }
                } else {
                    IgdsDialogStyleExamplesFragment igdsDialogStyleExamplesFragment = IgdsDialogStyleExamplesFragment.this;
                    A0W.A0o(igdsDialogStyleExamplesFragment.mImageUrl, igdsDialogStyleExamplesFragment.mAnalyticsModule);
                }
                A0W.A0Y((DialogInterface.OnClickListener) null, r10, IgdsDialogStyleExamplesFragment.PRIMARY_BUTTON_LABEL, true);
                A0W.A0q(true);
                A0W.A0r(true);
                AnonymousClass0wJ.A1K(A0W);
                C14030oh.A0C(-626075049, A05);
            }
        }, "Headline, three buttons, long button text", A0v);
        setItems(A0v);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131825237);
    }

    public boolean isScrolledToTop() {
        return getScrollingViewProxy().BRQ();
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1685973138);
        super.onCreate(bundle);
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        this.mContext = requireContext();
        this.mAnalyticsModule = new C15720rm("igds_dialog_style_examples");
        this.mImageUrl = AnonymousClass0wJ.A0Y(this.mUserSession).B4M();
        C14030oh.A09(1689017057, A02);
    }

    public void onResume() {
        int A02 = C14030oh.A02(432123763);
        super.onResume();
        setAndCreateItems();
        C14030oh.A09(282782988, A02);
    }
}
