package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Pair;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.50T  reason: invalid class name */
public final class AnonymousClass50T extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C111236n0 A04;
    public boolean A05;
    public float[] A06;
    public float[] A07;
    public float[] A08;
    public float[] A09;
    public final int A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Path A0F;
    public final Path A0G;
    public final Path A0H = C86144wL.A0G();
    public final Path A0I = C86144wL.A0G();
    public final int A0J;
    public final int A0K;

    public final void onDraw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A05) {
            canvas.drawPath(this.A0H, this.A0D);
            canvas.drawPath(this.A0F, this.A0B);
        }
        canvas.drawPath(this.A0I, this.A0E);
        canvas.drawPath(this.A0G, this.A0C);
    }

    public static void A00(Path path, Path path2, Path path3, Path path4, Pair pair) {
        Object obj = pair.first;
        C04220Ms.A05(obj);
        float floatValue = ((Number) obj).floatValue();
        Object obj2 = pair.second;
        C04220Ms.A05(obj2);
        path.lineTo(floatValue, ((Number) obj2).floatValue());
        Object obj3 = pair.first;
        C04220Ms.A05(obj3);
        float floatValue2 = ((Number) obj3).floatValue();
        Object obj4 = pair.second;
        C04220Ms.A05(obj4);
        path2.lineTo(floatValue2, ((Number) obj4).floatValue());
        Object obj5 = pair.first;
        C04220Ms.A05(obj5);
        float floatValue3 = ((Number) obj5).floatValue();
        Object obj6 = pair.second;
        C04220Ms.A05(obj6);
        path3.moveTo(floatValue3, ((Number) obj6).floatValue());
        Object obj7 = pair.first;
        C04220Ms.A05(obj7);
        float floatValue4 = ((Number) obj7).floatValue();
        Object obj8 = pair.second;
        C04220Ms.A05(obj8);
        path4.moveTo(floatValue4, ((Number) obj8).floatValue());
    }

    public final float[] getXPositions() {
        float[] fArr = this.A06;
        if (fArr != null) {
            return fArr;
        }
        C04220Ms.A0E("xPositions");
        throw null;
    }

    public final void onMeasure(int i, int i2) {
        String str;
        float[] fArr;
        float f;
        float f2;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = this.A0A;
        this.A01 = (measuredHeight - i3) - this.A0J;
        int measuredWidth = getMeasuredWidth() - this.A0K;
        this.A02 = measuredWidth;
        float[] fArr2 = this.A07;
        if (fArr2 != null) {
            int i4 = 0;
            int length = fArr2.length;
            if (length == 0) {
                fArr = new float[0];
            } else {
                fArr = new float[length];
                do {
                    float f3 = fArr2[i4];
                    C111236n0 r1 = this.A04;
                    if (r1 != null) {
                        float f4 = r1.A01;
                        float f5 = r1.A00;
                        if (f5 < f4) {
                            f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        } else {
                            f2 = ((float) measuredWidth) * (((f3 - f4) * 1.0f) / (f5 - f4));
                        }
                        fArr[i4] = f2;
                        i4++;
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                } while (i4 < length);
            }
        } else {
            float[] fArr3 = this.A09;
            if (fArr3 == null) {
                str = "yValues";
                C04220Ms.A0E(str);
                throw null;
            }
            int length2 = fArr3.length;
            float f6 = (((float) measuredWidth) * 1.0f) / ((float) (length2 - 1));
            fArr = new float[length2];
            for (int i5 = 0; i5 < length2; i5++) {
                fArr[i5] = ((float) i5) * f6;
            }
        }
        this.A06 = fArr;
        float[] fArr4 = this.A09;
        str = "yValues";
        if (fArr4 != null) {
            int length3 = fArr4.length;
            float[] fArr5 = new float[length3];
            int i6 = 0;
            while (i6 < length3) {
                float f7 = (float) i3;
                int i7 = this.A01;
                float f8 = fArr4[i6];
                C111236n0 r12 = this.A04;
                if (r12 != null) {
                    float f9 = r12.A03;
                    float f10 = r12.A02;
                    if (f10 < f9) {
                        f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    } else {
                        f = ((float) i7) * (((f10 - f8) * 1.0f) / (f10 - f9));
                    }
                    fArr5[i6] = f7 + f;
                    i6++;
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            }
            this.A08 = fArr5;
            float f11 = (float) i3;
            C111236n0 r3 = this.A04;
            if (r3 != null) {
                float f12 = r3.A02;
                this.A00 = f11 + (((f12 * 1.0f) / (f12 - r3.A03)) * ((float) this.A01));
                Path path = this.A0I;
                path.reset();
                Path path2 = this.A0H;
                path2.reset();
                Path path3 = this.A0G;
                path3.reset();
                Path path4 = this.A0F;
                path4.reset();
                float[] fArr6 = this.A09;
                if (fArr6 != null) {
                    int i8 = 0;
                    int i9 = (fArr6[0] > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (fArr6[0] == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1));
                    float f13 = getXPositions()[0];
                    float[] fArr7 = this.A08;
                    if (i9 >= 0) {
                        if (fArr7 != null) {
                            path.moveTo(f13, fArr7[0]);
                            path2.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A00);
                        }
                        C04220Ms.A0E("yPositions");
                        throw null;
                    }
                    if (fArr7 != null) {
                        path3.moveTo(f13, fArr7[0]);
                        path4.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A00);
                    }
                    C04220Ms.A0E("yPositions");
                    throw null;
                    int i10 = this.A03;
                    while (i8 < i10) {
                        float[] fArr8 = this.A09;
                        if (fArr8 != null) {
                            int i11 = (fArr8[i8] > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (fArr8[i8] == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1));
                            float f14 = getXPositions()[i8];
                            float[] fArr9 = this.A08;
                            if (i11 >= 0) {
                                if (fArr9 != null) {
                                    path.lineTo(f14, fArr9[i8]);
                                    float f15 = getXPositions()[i8];
                                    float[] fArr10 = this.A08;
                                    if (fArr10 != null) {
                                        path2.lineTo(f15, fArr10[i8]);
                                        int i12 = i8 + 1;
                                        if (i12 >= this.A03) {
                                            continue;
                                        } else {
                                            float[] fArr11 = this.A09;
                                            if (fArr11 != null) {
                                                if (fArr11[i12] < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                                    float f16 = getXPositions()[i8];
                                                    float[] fArr12 = this.A08;
                                                    if (fArr12 != null) {
                                                        float f17 = fArr12[i8];
                                                        float f18 = getXPositions()[i12];
                                                        float[] fArr13 = this.A08;
                                                        if (fArr13 != null) {
                                                            float f19 = (fArr13[i12] - f17) / (f18 - f16);
                                                            float f20 = this.A00;
                                                            A00(path, path2, path3, path4, new Pair(Float.valueOf((f20 - (f17 - (f16 * f19))) / f19), Float.valueOf(f20)));
                                                        }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                }
                                C04220Ms.A0E("yPositions");
                                throw null;
                            }
                            if (fArr9 != null) {
                                path3.lineTo(f14, fArr9[i8]);
                                float f21 = getXPositions()[i8];
                                float[] fArr14 = this.A08;
                                if (fArr14 != null) {
                                    path4.lineTo(f21, fArr14[i8]);
                                    int i13 = i8 + 1;
                                    if (i13 >= this.A03) {
                                        continue;
                                    } else {
                                        float[] fArr15 = this.A09;
                                        if (fArr15 != null) {
                                            if (fArr15[i13] >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                                float f22 = getXPositions()[i8];
                                                float[] fArr16 = this.A08;
                                                if (fArr16 != null) {
                                                    float f23 = fArr16[i8];
                                                    float f24 = getXPositions()[i13];
                                                    float[] fArr17 = this.A08;
                                                    if (fArr17 != null) {
                                                        float f25 = (fArr17[i13] - f23) / (f24 - f22);
                                                        float f26 = this.A00;
                                                        A00(path3, path4, path, path2, new Pair(Float.valueOf((f26 - (f23 - (f22 * f25))) / f25), Float.valueOf(f26)));
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                            C04220Ms.A0E("yPositions");
                            throw null;
                            i8++;
                        }
                    }
                    path2.lineTo((float) this.A02, this.A00);
                    path4.lineTo((float) this.A02, this.A00);
                    return;
                }
            } else {
                throw C18180wK.A0a("Required value was null.");
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public AnonymousClass50T(Context context) {
        super(context);
        Paint A0F2 = C86144wL.A0F();
        this.A0E = A0F2;
        Paint A0F3 = C86144wL.A0F();
        this.A0D = A0F3;
        Paint A0F4 = C86144wL.A0F();
        this.A0C = A0F4;
        this.A0B = C86144wL.A0F();
        this.A0G = C86144wL.A0G();
        this.A0F = C86144wL.A0G();
        A0F2.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material));
        C86104wH.A18(context, A0F2, R.color.blue_5);
        Paint.Style style = Paint.Style.STROKE;
        A0F2.setStyle(style);
        C86104wH.A18(context, A0F3, R.color.blue_5);
        C86134wK.A13(A0F3);
        A0F4.setStrokeWidth((float) C18220wO.A01(context, R.dimen.abc_control_corner_material));
        C86104wH.A18(context, A0F4, R.color.blue_3);
        A0F4.setStyle(style);
        this.A0A = C86114wI.A05(context);
        this.A0J = C86164wN.A0D(this).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        this.A0K = C86114wI.A05(context);
    }
}
