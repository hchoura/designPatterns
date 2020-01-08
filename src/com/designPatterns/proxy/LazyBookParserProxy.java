package com.designPatterns.proxy;

public class LazyBookParserProxy implements IBookParser {

  private String     book = null;
  private BookParser bp   = null;

  private LazyBookParserProxy(String book) {
    this.book = book;
  }

  @Override
  public int getNumberOfPages() {
    if ( bp == null ) {// it is delayed, lazy, on demand (performance)
      bp = new BookParser(book);
    }

    return bp.getNumberOfPages();
  }

}
