package com.trieunt.ungdungquanlykhachhang.repository;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();
}
