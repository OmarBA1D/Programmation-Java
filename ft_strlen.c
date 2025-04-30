/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strlen.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/15 16:05:35 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/21 14:02:07 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <string.h>
#include <stdio.h>

size_t	ft_strlen(const char *s)
{
	size_t	i;

	i = 0;
	while (s[i] != '\0')
	{
		i++;
	}
	return (i);
}
/*
int	main(void)
{
	char *a ="Hola! Buongiornooo";
	char *b = "Ciaoooo! Ragazieee";

	printf("Length of string a = %zu \n", strlen(a));
	printf("Length of string b = %zu \n", strlen(b));

	return (0);
}*/
