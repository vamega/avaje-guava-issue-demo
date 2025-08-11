package com.bitfiddling;

import com.google.common.collect.ImmutableList;
import io.avaje.jsonb.Json;

@Json
public record Book(String title, ImmutableList<String> authors) { }
