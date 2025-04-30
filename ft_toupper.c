/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_toupper.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/23 13:51:31 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/23 14:15:18 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <ctype.h>
#include <stdio.h>

int	ft_toupper(int c)
{
	if (c >= 'a' && c <= 'z')
	{
		return (c -32);
	}
	return (c);
}

int	main(void)
{
	char	letra;

	letra = 'h';
	printf("Original: %c\n", letra);
	printf("Convertido: %c\n", ft_toupper(letra));
	return (0);
}
