/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_isalnum.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/07 15:34:37 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/07 15:46:46 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <stdio.h>

int	isalnum(int c)
{
	if (c >= 'a' && c <= 'z')
	{
		return (1);
	}
	else if (c >= 'A' && c <= 'Z')
	{
		return (2);
	}
	else if (c >= '0' && c <= '9')
	{
		return (3);
	}
	else
	{
		return (0);
	}
}
/*
int	main(void)
{
	int J;

	J = isalnum('-');
	printf("%d", J);
}*/
