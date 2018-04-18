package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
  // TODO why don't we need an explicit constructor?-did

  @Override
  public E push(final E obj) {
    // TODO-did
    top=new Node<E>(obj,top);
    return obj;
  }

  @Override
  public E peek() {
    // TODO-did
    if(isEmpty())
      throw new NoSuchElementException();
    else
      return top.data;
  }

  @Override
  public E pop() {
    // TODO-did
    if(isEmpty())
      throw new NoSuchElementException();
    else{
      Node<E> toGive= top;
      top=top.next;
      return toGive.data;
    }
  }

  @Override
  public boolean isEmpty() {
    // TODO-did
    return top==null;
  }


  @Override
  public List<E> asList() {
    final ArrayList<E> result = new ArrayList<>(10);
    populateList(top, result); // TODO replace null with the right reference-did
    return result;
  }

  private void populateList(final Node<E> curr, final List<E> result) {
    // TODO recursively populate the list in the desired order-did
    if (curr==null) {
      return;
    }
    else{
      result.add(curr.data);
      populateList(curr.next,result);
    }
  }

  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>(10);
    populateFifoList(top, result); // TODO replace null with the right reference-did
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    // TODO recursively populate the list in the desired order-did
    if (curr==null) {
      return;
    }
    else{
      result.add(0,curr.data);
      populateFifoList(curr.next,result);
    }
  }

}
