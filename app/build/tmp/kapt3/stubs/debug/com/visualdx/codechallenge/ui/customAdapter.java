package com.visualdx.codechallenge.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0018\u0019B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0016J\"\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/visualdx/codechallenge/ui/customAdapter;", "Landroid/widget/BaseAdapter;", "Landroid/widget/Filterable;", "items", "", "Lcom/visualdx/codechallenge/network/Currency;", "(Ljava/util/List;)V", "listFilter", "Lcom/visualdx/codechallenge/ui/customAdapter$ListFilter;", "getCount", "", "getDropDownView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "getFilter", "Landroid/widget/Filter;", "getItem", "getItemId", "", "p0", "getView", "ListFilter", "myAutoCompleteHolder", "app_debug"})
public final class customAdapter extends android.widget.BaseAdapter implements android.widget.Filterable {
    private java.util.List<com.visualdx.codechallenge.network.Currency> items;
    private com.visualdx.codechallenge.ui.customAdapter.ListFilter listFilter;
    
    public customAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.visualdx.codechallenge.network.Currency> items) {
        super();
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getDropDownView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.visualdx.codechallenge.network.Currency getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public long getItemId(int p0) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/visualdx/codechallenge/ui/customAdapter$myAutoCompleteHolder;", "", "binding", "Lcodechallenge/databinding/DropdownRowBinding;", "(Lcom/visualdx/codechallenge/ui/customAdapter;Lcodechallenge/databinding/DropdownRowBinding;)V", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "app_debug"})
    public final class myAutoCompleteHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        public myAutoCompleteHolder(@org.jetbrains.annotations.NotNull()
        codechallenge.databinding.DropdownRowBinding binding) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0014\u00a8\u0006\n"}, d2 = {"Lcom/visualdx/codechallenge/ui/customAdapter$ListFilter;", "Landroid/widget/Filter;", "(Lcom/visualdx/codechallenge/ui/customAdapter;)V", "performFiltering", "Landroid/widget/Filter$FilterResults;", "constraint", "", "publishResults", "", "results", "app_debug"})
    public final class ListFilter extends android.widget.Filter {
        
        public ListFilter() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected android.widget.Filter.FilterResults performFiltering(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence constraint) {
            return null;
        }
        
        @java.lang.Override()
        protected void publishResults(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence constraint, @org.jetbrains.annotations.Nullable()
        android.widget.Filter.FilterResults results) {
        }
    }
}