package com.instagram.commerce.cart.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C147888q5;
import X.C147898q6;
import X.C148948sc;
import X.C18170wI;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C21830C2f;
import X.C21831C2g;
import X.C63383hO;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class CommerceShopsViewerCartResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbShopsViewer extends TreeJNI implements C81204nM {

        public final class Cart extends TreeJNI implements C81204nM {

            public final class MerchantCarts extends TreeJNI implements C81204nM {

                public final class Edges extends TreeJNI implements C81204nM {

                    public final class Node extends TreeJNI implements C81204nM {

                        public final class Merchant extends TreeJNI implements C147888q5 {
                            public final String[] getScalarFields() {
                                return new String[]{"ig_id", C18170wI.A00(103), C63383hO.A01(83, 8, 48)};
                            }
                        }

                        public final class Products extends TreeJNI implements C147898q6 {

                            public final class ProductsEdges extends TreeJNI implements C81204nM {

                                public final class ProductsEdgesNode extends TreeJNI implements C81204nM {

                                    public final class Product extends TreeJNI implements C81204nM {

                                        public final class ShopMerchant extends TreeJNI implements C81204nM {
                                            public final String[] getScalarFields() {
                                                return new String[]{"merchant_ig_id"};
                                            }
                                        }

                                        public final class StrikethroughPrice extends TreeJNI implements C81204nM {
                                            public final String[] getScalarFields() {
                                                return new String[]{"formatted_amount"};
                                            }
                                        }

                                        public final class CheckoutInfo extends TreeJNI implements C21830C2f {

                                            public final class EstimatedDeliveryWindow extends TreeJNI implements C81204nM {
                                                public final String[] getScalarFields() {
                                                    return new String[]{"maximum_date", "minimum_date"};
                                                }
                                            }

                                            public final class ShippingCost extends TreeJNI implements C81204nM {
                                                public final String[] getScalarFields() {
                                                    return new String[]{"amount", "amount_with_offset", "currency", "formatted_amount(strip_currency_zeros:true)", "offset"};
                                                }
                                            }

                                            public final class ReturnCost extends TreeJNI implements C81204nM {
                                                public final String[] getScalarFields() {
                                                    return C18220wO.A1Z();
                                                }
                                            }

                                            public final C108776iv[] getEdgeFields() {
                                                return new C108776iv[]{C18190wL.A0G(EstimatedDeliveryWindow.class, "estimated_delivery_window", false), C18190wL.A0G(ReturnCost.class, "return_cost", false), C18190wL.A0G(ShippingCost.class, "shipping_cost", false)};
                                            }

                                            public final String[] getScalarFields() {
                                                return C148948sc.A1a();
                                            }
                                        }

                                        public final class CurrentPrice extends TreeJNI implements C21831C2g {
                                            public final String[] getScalarFields() {
                                                return new String[]{"amount", "amount_with_offset", "currency", "offset"};
                                            }
                                        }

                                        public final class ListingPrice extends TreeJNI implements C81204nM {
                                            public final String[] getScalarFields() {
                                                return new String[]{"formatted_amount(strip_currency_zeros:true)"};
                                            }
                                        }

                                        public final String[] getScalarFields() {
                                            return new String[]{"can_viewer_see_rnr", DevServerEntity.COLUMN_DESCRIPTION, "has_variants", "has_viewer_saved", "id", "ig_capability_review_status", "ig_is_product_editable_on_mobile", "is_in_stock", FXPFAccessLibraryDebugFragment.NAME, "size_calibration_score"};
                                        }

                                        public final C108776iv[] getEdgeFields() {
                                            return new C108776iv[]{C18190wL.A0G(CurrentPrice.class, "current_price", false), C18190wL.A0G(ShopMerchant.class, "shop_merchant", false), C18190wL.A0G(StrikethroughPrice.class, "strikethrough_price", false), C18190wL.A0G(ListingPrice.class, "listing_price", false), C18190wL.A0G(CheckoutInfo.class, "checkout_info", false)};
                                        }
                                    }

                                    public final String[] getScalarFields() {
                                        return new String[]{"quantity"};
                                    }

                                    public final C108776iv[] getEdgeFields() {
                                        return AnonymousClass0wJ.A1a(Product.class, "product");
                                    }
                                }

                                public final C108776iv[] getEdgeFields() {
                                    return AnonymousClass0wJ.A1a(ProductsEdgesNode.class, "node");
                                }
                            }

                            public final C108776iv[] getEdgeFields() {
                                return AnonymousClass0wJ.A1b(ProductsEdges.class, "edges");
                            }
                        }

                        public final String[] getScalarFields() {
                            return new String[]{"id", "item_count"};
                        }

                        public final C108776iv[] getEdgeFields() {
                            return C18180wK.A1a(C18190wL.A0G(Merchant.class, "merchant", false), Products.class, "products", false);
                        }
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(Node.class, "node");
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(Edges.class, "edges");
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"id", "total_item_count"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(MerchantCarts.class, "merchant_carts");
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"id"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Cart.class, "cart");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbShopsViewer.class, "xfb_shops_viewer");
    }
}
