/* This file was generated by SableCC (http://www.sablecc.org/). */

package minijava.node;

import java.util.*;
import minijava.analysis.*;

@SuppressWarnings("nls")
public final class ANewvecExpression extends PExpression
{
    private PExpression _l_;
    private final LinkedList<PExpression> _i_ = new LinkedList<PExpression>();

    public ANewvecExpression()
    {
        // Constructor
    }

    public ANewvecExpression(
        @SuppressWarnings("hiding") PExpression _l_,
        @SuppressWarnings("hiding") List<PExpression> _i_)
    {
        // Constructor
        setL(_l_);

        setI(_i_);

    }

    @Override
    public Object clone()
    {
        return new ANewvecExpression(
            cloneNode(this._l_),
            cloneList(this._i_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANewvecExpression(this);
    }

    public PExpression getL()
    {
        return this._l_;
    }

    public void setL(PExpression node)
    {
        if(this._l_ != null)
        {
            this._l_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._l_ = node;
    }

    public LinkedList<PExpression> getI()
    {
        return this._i_;
    }

    public void setI(List<PExpression> list)
    {
        this._i_.clear();
        this._i_.addAll(list);
        for(PExpression e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._l_)
            + toString(this._i_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._l_ == child)
        {
            this._l_ = null;
            return;
        }

        if(this._i_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._l_ == oldChild)
        {
            setL((PExpression) newChild);
            return;
        }

        for(ListIterator<PExpression> i = this._i_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExpression) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}